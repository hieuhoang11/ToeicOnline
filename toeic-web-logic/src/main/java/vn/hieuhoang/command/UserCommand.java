package vn.hieuhoang.command;

import vn.hieuhoang.core.dto.UserDTO;
import vn.hieuhoang.core.web.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand () {
        this.pojo = new UserDTO() ;
    }
}
