/**
 * Copyright (C) 2006 Dragos Balan (dragos.balan@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.reportengine.core.algorithm;

import net.sf.reportengine.util.AlgoIOKeys;

import java.util.Map;

/**
 * <p>
 * this is the base interface for all report algorithm
 * </p>
 * 
 * @author dragos balan (dragos dot balan at gmail dot com)
 */
@FunctionalInterface
public interface Algorithm {

    /**
     * executes the algorithm based on the input and returns the output
     * 
     * @param input
     *            the input parameter map
     * @return an output parameter map
     */
    Map<AlgoIOKeys, Object> execute(Map<AlgoIOKeys, Object> input);

}
