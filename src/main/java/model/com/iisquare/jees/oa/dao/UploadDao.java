package com.iisquare.jees.oa.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.iisquare.jees.framework.model.DaoBase;
import com.iisquare.jees.oa.domain.Upload;

@Repository
@Scope("prototype")
public class UploadDao extends DaoBase<Upload> {
	
	public UploadDao() {
		super(Upload.class);
	}
}
