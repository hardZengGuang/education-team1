package com.socialinsurance.model.po;
import java.security.Timestamp;


import lombok.Data;

/**
 * @author 曾广
 *
 */
@Data
public class News {
	private Integer id;//����id
	private Integer sort_no;
	private String news_code;
	private String news_title;//���ű���
	private String news_content;//��������
	private char data_status;
	private Timestamp creation_time;
	
	
	
	

}
