package vn.hieuhoang.command;

import vn.hieuhoang.core.dto.ListenGuidelineDTO;
import vn.hieuhoang.core.web.command.AbstractCommand;

/**
 * Created by Hieu Hoang on 11/09/2018.
 */
public class ListenGuideLineCommand extends AbstractCommand<ListenGuidelineDTO> {

    public ListenGuideLineCommand () {
        this.pojo = new ListenGuidelineDTO ();
    }
}
