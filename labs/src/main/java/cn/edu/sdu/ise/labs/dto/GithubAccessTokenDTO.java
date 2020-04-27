package cn.edu.sdu.ise.labs.dto;

import lombok.Data;

@Data
public class GithubAccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
