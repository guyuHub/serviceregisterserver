package guyu.test.service-register-server.converter;

import java.util.List;

/**
 * @author guyu
 * @date 2019/4/2
 */
public interface BaseConverter <SRC_OBJECT, DEST_OBJECT> {

    DEST_OBJECT to(SRC_OBJECT dataObject);

    List<DEST_OBJECT> to(List<SRC_OBJECT> dataObjects);

    SRC_OBJECT back(DEST_OBJECT modelObject);

    List<SRC_OBJECT> back(List<DEST_OBJECT> modelObjects);
}