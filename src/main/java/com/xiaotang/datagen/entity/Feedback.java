package com.xiaotang.datagen.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;

/**
 * @author Administrator
 * 用户意见反馈信息记录表
 */
@Table
public class Feedback {
	@Column
	private String feedbackId;
	@Column
	private String userId;
	@Column
	private String userOpinion;

	public String getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpinion() {
		return userOpinion;
	}

	public void setUserOpinion(String userOpinion) {
		this.userOpinion = userOpinion;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", userId=" + userId + ", userOpinion="
				+ userOpinion + "]";
	}

	
}
