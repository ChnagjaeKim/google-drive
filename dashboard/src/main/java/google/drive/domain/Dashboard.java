package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileName;
    private String fileType;
    private Long fileSize;
    private String filePath;
    private Boolean isuploaded;
    private Boolean isindexed;
    private String url;
}
