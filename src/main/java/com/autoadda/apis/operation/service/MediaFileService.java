package com.autoadda.apis.operation.service;


import com.autoadda.apis.operation.entity.MediaFile;
import com.autoadda.apis.operation.response.GenericResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MediaFileService {

    List<MediaFile> upload(List<MultipartFile> files) throws IOException;

    GenericResponse delete(Long mediaFileId);

    GenericResponse getMediaFileById(Long mediaFileId);
}
