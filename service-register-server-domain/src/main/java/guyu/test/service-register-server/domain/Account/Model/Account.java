package guyu.test.service-register-server.domain.Account.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Account {
    /**
     * 账户ID
     */
    private Long service-register-serverId;

    /**
     * 账户名称
     */
    private String name;

    /**
     * 账户手机号
     */
    private String telePhone;

    /**
     * 身份证号
     */
    private String identityCardNum;

    /**
     * 账户创建时间
     */
    private Date createTime;
}
