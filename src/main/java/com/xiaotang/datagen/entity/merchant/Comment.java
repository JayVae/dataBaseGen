package com.xiaotang.datagen.entity.merchant;



import java.util.Date;

public class Comment {
    private String commentId;//评价id
    //小区id
    private String housingEstateId;
    //用户id
    private String orduserid;
    //服务评分
    private Integer commentService;
    //时长评分
    private Integer commentDuration;
    //环境评分
    private Integer commentEvironmentalScience;
    //时间

    private Date commentTime;
    //评论内容
    private String commentContent;
    //订单id
    private String parkingOrderId;
    
    
	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getHousingEstateId() {
		return housingEstateId;
	}

	public void setHousingEstateId(String housingEstateId) {
		this.housingEstateId = housingEstateId;
	}

	public String getOrduserid() {
		return orduserid;
	}

	public void setOrduserid(String orduserid) {
		this.orduserid = orduserid;
	}

	public Integer getCommentService() {
		return commentService;
	}

	public void setCommentService(Integer commentService) {
		this.commentService = commentService;
	}

	public Integer getCommentDuration() {
		return commentDuration;
	}

	public void setCommentDuration(Integer commentDuration) {
		this.commentDuration = commentDuration;
	}

	public Integer getCommentEvironmentalScience() {
		return commentEvironmentalScience;
	}

	public void setCommentEvironmentalScience(Integer commentEvironmentalScience) {
		this.commentEvironmentalScience = commentEvironmentalScience;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	
	public String getParkingOrderId() {
		return parkingOrderId;
	}

	public void setParkingOrderId(String parkingOrderId) {
		this.parkingOrderId = parkingOrderId;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", housingEstateId=" + housingEstateId + ", orduserid=" + orduserid
				+ ", commentService=" + commentService + ", commentDuration=" + commentDuration
				+ ", commentEvironmentalScience=" + commentEvironmentalScience + ", commentTime=" + commentTime
				+ ", commentContent=" + commentContent + ", parkingOrderId=" + parkingOrderId + "]";
	}

    
    
    
    
    
    




    
    
}