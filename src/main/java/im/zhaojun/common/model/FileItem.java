package im.zhaojun.common.model;

import im.zhaojun.common.enums.FileTypeEnum;

import java.io.Serializable;
import java.util.Date;

public class FileItem implements Serializable {

    private String name;
    private Date time;
    private Long size;
    private FileTypeEnum type;
    private String path;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public FileTypeEnum getType() {
        return type;
    }

    public void setType(FileTypeEnum type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}