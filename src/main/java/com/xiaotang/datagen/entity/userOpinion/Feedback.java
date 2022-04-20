package com.xiaotang.datagen.entity.userOpinion;

/**
 * @author Administrator
 * 用户意见反馈信息记录表
 */
public class Feedback {
	
	private String feedbackId;
	
	private String userId;
	
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
