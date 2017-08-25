/*
Copyright Google Inc. 2015
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
**/

package com.google.cloud.solutions;

import org.apache.avro.reflect.Nullable;
import org.apache.beam.sdk.coders.AvroCoder;
import org.apache.beam.sdk.coders.DefaultCoder;
import org.joda.time.Instant;

@DefaultCoder(AvroCoder.class)
class LogMessage {
    @Nullable private Instant timestamp;
    @Nullable private int httpStatusCode;
    @Nullable private double responseTime;
    @Nullable private String source;
    @Nullable private String httpMethod;
    @Nullable private String destination;

    @SuppressWarnings("unused")
    public LogMessage() {}

    LogMessage(Instant timestamp, int httpStatusCode, double responseTime,
               String source, String httpMethod, String destination) {
        this.timestamp = timestamp;
        this.httpStatusCode = httpStatusCode;
        this.responseTime = responseTime;
        this.source = source;
        this.httpMethod = httpMethod;
        this.destination = destination;
    }

    Instant getTimestamp() {
        return this.timestamp;
    }

    int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    double getResponseTime() {
        return this.responseTime;
    }

    String getSource() {
        return this.source;
    }

    String getHttpMethod() {
        return this.httpMethod;
    }

    String getDestination() {
        return this.destination;
    }
}
