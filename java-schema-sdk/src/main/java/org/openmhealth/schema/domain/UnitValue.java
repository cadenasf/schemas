/*
 * Copyright 2015 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.schema.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;


/**
 * A base class for unit value tuples.
 *
 * @author Emerson Farrugia
 * @version 1.0
 * @see <a href="http://www.openmhealth.org/developers/schemas/#unit-value">unit-value</a>
 */
public class UnitValue {

    private String unit;
    private BigDecimal value;

    @JsonCreator
    public UnitValue(@JsonProperty("unit") String unit, @JsonProperty("value") BigDecimal value) {

        checkNotNull(unit, "A unit hasn't been specified.");
        checkArgument(!unit.isEmpty(), "An empty unit has been specified.");
        checkNotNull(value, "A value hasn't been specified.");

        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public BigDecimal getValue() {
        return value;
    }
}
