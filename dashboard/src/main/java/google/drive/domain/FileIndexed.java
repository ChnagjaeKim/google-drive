package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long file id;
    private List<String> keywords;
}
