/*
 * Copyright (C) 2018. Huawei Technologies Co., LTD. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of Apache License, Version 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Apache License, Version 2.0 for more details.
 */
package com.smn.response.topic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * topic info
 *
 * @author zhangyx
 * @version 2.0.0
 */
public class TopicInfo {

    @JsonProperty("name")
    private String name;

    @JsonProperty("topic_urn")
    private String topicUrn;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("push_policy")
    private String pushPolicy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPushPolicy() {
        return pushPolicy;
    }

    public void setPushPolicy(String pushPolicy) {
        this.pushPolicy = pushPolicy;
    }
}