package com.service.mall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CochainVO {

    private String digestHash;

    private String signatureInfo;

    private String timestampStr;

}