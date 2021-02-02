package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款条款查询
 *
 * @author auto create
 * @since 1.0, 2021-01-29 15:42:37
 */
public class AlipayBossFncGfsettlePaycontractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7364365161832217672L;

	/**
	 * 查询条件
	 */
	@ApiField("pay_contract_base_dto")
	private PayContractBaseDTO payContractBaseDto;

	public PayContractBaseDTO getPayContractBaseDto() {
		return this.payContractBaseDto;
	}
	public void setPayContractBaseDto(PayContractBaseDTO payContractBaseDto) {
		this.payContractBaseDto = payContractBaseDto;
	}

}