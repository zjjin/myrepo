package so.model;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    private Integer id;

    private Integer companyId;

    private Date startTime;

    private Date endTime;

    private String rentGround;

    private BigDecimal rentCost;

    private BigDecimal deposit;

    private String attachmentName;

    private String attachmentUrl;

    private Date created;

    private Integer createdAdminUserId;

    private Date updated;

    private Integer updatedAdminUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRentGround() {
        return rentGround;
    }

    public void setRentGround(String rentGround) {
        this.rentGround = rentGround == null ? null : rentGround.trim();
    }

    public BigDecimal getRentCost() {
        return rentCost;
    }

    public void setRentCost(BigDecimal rentCost) {
        this.rentCost = rentCost;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName == null ? null : attachmentName.trim();
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl == null ? null : attachmentUrl.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getCreatedAdminUserId() {
        return createdAdminUserId;
    }

    public void setCreatedAdminUserId(Integer createdAdminUserId) {
        this.createdAdminUserId = createdAdminUserId;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getUpdatedAdminUserId() {
        return updatedAdminUserId;
    }

    public void setUpdatedAdminUserId(Integer updatedAdminUserId) {
        this.updatedAdminUserId = updatedAdminUserId;
    }
}