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
}
