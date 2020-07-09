package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户添加小目标
 *
 * @author auto create
 * @since 1.0, 2020-02-25 22:49:48
 */
public class AlipaySocialBaseQuestInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 7328169528547882947L;

	/**
	 * 目标ID
	 */
	@ApiField("quest_id")
	private String questId;

	/**
	 * 每日打卡提醒时间范围，小目标提醒时间会在这个范围随机设定，时间格式HH-MM，开始时间和结束时间-分割。
	 */
	@ApiField("remind_time_range")
	private String remindTimeRange;

	/**
	 * 调用方标识
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getQuestId() {
		return this.questId;
	}
	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public String getRemindTimeRange() {
		return this.remindTimeRange;
	}
	public void setRemindTimeRange(String remindTimeRange) {
		this.remindTimeRange = remindTimeRange;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}