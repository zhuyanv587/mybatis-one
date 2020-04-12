package com.example.mybatis.generator.model;

import java.io.Serializable;

public class Message implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_id
     *
     * @mbg.generated
     */
    private Integer msgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_text
     *
     * @mbg.generated
     */
    private String msgText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_summary
     *
     * @mbg.generated
     */
    private String msgSummary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_id
     *
     * @return the value of message.msg_id
     *
     * @mbg.generated
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public Message withMsgId(Integer msgId) {
        this.setMsgId(msgId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_id
     *
     * @param msgId the value for message.msg_id
     *
     * @mbg.generated
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_text
     *
     * @return the value of message.msg_text
     *
     * @mbg.generated
     */
    public String getMsgText() {
        return msgText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public Message withMsgText(String msgText) {
        this.setMsgText(msgText);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_text
     *
     * @param msgText the value for message.msg_text
     *
     * @mbg.generated
     */
    public void setMsgText(String msgText) {
        this.msgText = msgText == null ? null : msgText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_summary
     *
     * @return the value of message.msg_summary
     *
     * @mbg.generated
     */
    public String getMsgSummary() {
        return msgSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public Message withMsgSummary(String msgSummary) {
        this.setMsgSummary(msgSummary);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_summary
     *
     * @param msgSummary the value for message.msg_summary
     *
     * @mbg.generated
     */
    public void setMsgSummary(String msgSummary) {
        this.msgSummary = msgSummary == null ? null : msgSummary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgId=").append(msgId);
        sb.append(", msgText=").append(msgText);
        sb.append(", msgSummary=").append(msgSummary);
        sb.append("]");
        return sb.toString();
    }
}