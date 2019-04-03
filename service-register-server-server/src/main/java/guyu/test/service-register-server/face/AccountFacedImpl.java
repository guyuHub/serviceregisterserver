package guyu.test.service-register-server.face;

import guyu.test.service-register-server.converter.AccountDTOConverter;
import guyu.test.service-register-server.domain.Account.Model.Account;
import guyu.test.facade.AccountFaced;
import guyu.test.model.AccountDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/service-register-serverFaced")
public class AccountFacedImpl implements AccountFaced{

    @Resource
    private AccountDTOConverter service-register-serverDTOConverter;

    @RequestMapping("/queryAccountByAccountId")
    public AccountDTO queryAccountByAccountId(Long service-register-serverId) {
        Account service-register-server = new Account();
        service-register-server.setAccountId(1000110001L);
        service-register-server.setName("大哥大");
        return service-register-serverDTOConverter.back(service-register-server);
    }
}
