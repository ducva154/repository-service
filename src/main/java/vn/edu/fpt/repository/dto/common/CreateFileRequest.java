package vn.edu.fpt.repository.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 05/12/2022 - 15:54
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateFileRequest implements Serializable {

    private static final long serialVersionUID = -8018425855089614074L;
    private String name;
    private String base64;
    private Long size;
    private String mimeType;
}
