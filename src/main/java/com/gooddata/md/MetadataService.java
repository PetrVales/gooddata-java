/*
 * Copyright (C) 2007-2014, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.md;

import com.gooddata.AbstractService;
import com.gooddata.UriResponse;
import com.gooddata.project.Project;
import org.springframework.web.client.RestTemplate;

/**
 */
public class MetadataService extends AbstractService {

    public MetadataService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    public <T extends Obj> T get(String uri, Class<T> cls) {
        return restTemplate.getForObject(uri, cls);
    }

    public <T extends Obj> T create(Project project, Metric obj) {
        final UriResponse response = restTemplate.postForObject(Obj.URI, obj, UriResponse.class, project.getId());
        return get(response.getUri(), (Class<T>)obj.getClass());
    }
}
