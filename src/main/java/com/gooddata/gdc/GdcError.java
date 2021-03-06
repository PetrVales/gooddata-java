/*
 * Copyright (C) 2007-2014, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.gdc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GoodData REST API error structure.
 * Deserialization only.
 */
@JsonTypeName("error")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GdcError extends ErrorStructure {

    @JsonCreator
    private GdcError(@JsonProperty("errorClass") String errorClass, @JsonProperty("component") String component,
                     @JsonProperty("parameters") String[] parameters, @JsonProperty("message") String message,
                     @JsonProperty("errorCode") String errorCode, @JsonProperty("errorId") String errorId,
                     @JsonProperty("trace") String trace, @JsonProperty("requestId") String requestId) {
        super(errorClass, component, parameters, message, errorCode, errorId, trace, requestId);
    }

}
