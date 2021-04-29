package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExtractRequestBody {
        // no need to add @JsonProperty since the name is the same as the json request
        public List<String> data;

        @JsonProperty("max_keywords") // to match with json format in the request body
        public int maxKeywords;

        public ExtractRequestBody(List<String> data, int maxKeywords) {
            this.data = data;
            this.maxKeywords = maxKeywords;
        }
}
