package com.lkd.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.entity.Partner;
import com.lkd.mapper.PartnerMapper;
import com.lkd.mapper.VendingMachineMapper;
import com.lkd.result.PageBean;
import com.lkd.service.PartnerService;
import com.lkd.vo.PartnerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartnerServiceImpl implements PartnerService {
    @Autowired
    private PartnerMapper partnerMapper;
    @Autowired
    private VendingMachineMapper vendingMachineMapper;


    //分页条件查询
    @Override
    public PageBean<PartnerVO> search(Integer pageIndex, Integer pageSize, String name) {
        //分页查询
        PageHelper.startPage(pageIndex, pageSize);
        List<Partner> partners = partnerMapper.search(name);
        Page<Partner> page = (Page<Partner>) partners;
        //遍历合作商获取每个合作商的设备数量，再将数据封装到PartnerVO中
        List<PartnerVO> partnerVOList = partners.stream().map(partner -> {
            Integer vmCount = vendingMachineMapper.countByOwnerId(partner.getId());
            PartnerVO partnerVO = BeanUtil.copyProperties(partner, PartnerVO.class);
            partnerVO.setVmCount(vmCount);
            return partnerVO;
        }).collect(Collectors.toList());

        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), partnerVOList);
    }

    //新增合作商
    @Override
    public boolean save(Partner partner) {
        return partnerMapper.save(partner);
    }

    //根据id查询合作商详情
    @Override
    public PartnerVO findById(Integer id) {
        //获取合作商信息
        PartnerVO partnerVO = BeanUtil.copyProperties(partnerMapper.getById(id), PartnerVO.class);
        //获取合作商设备数
        Integer vmCount = vendingMachineMapper.countByOwnerId(id);
        partnerVO.setVmCount(vmCount);
        return partnerVO;
    }

    //修改合作商
    @Override
    public boolean update(Partner partner) {
        return partnerMapper.update(partner);
    }

    //删除合作商
    @Override
    public boolean delete(Integer id) {
        return partnerMapper.delete(id);
    }

    //统计合作商数量
    @Override
    public Integer count() {
        return partnerMapper.count();
    }

}
