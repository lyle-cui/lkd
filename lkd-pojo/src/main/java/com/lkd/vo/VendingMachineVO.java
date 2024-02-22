package com.lkd.vo;

import com.lkd.entity.Node;
import com.lkd.entity.VendingMachine;
import com.lkd.entity.VmType;
import lombok.Data;

@Data
public class VendingMachineVO extends VendingMachine {
    private VmType type;
    private NodeVO node;
    private RegionVO region;
}
