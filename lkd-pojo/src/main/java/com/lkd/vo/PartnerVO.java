package com.lkd.vo;

import com.lkd.entity.Partner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartnerVO extends Partner {
    private Integer vmCount;
}
