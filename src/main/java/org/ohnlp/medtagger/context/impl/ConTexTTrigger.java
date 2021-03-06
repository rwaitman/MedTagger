/*
 * Copyright: (c)  2019  Mayo Foundation for Medical Education and
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ohnlp.medtagger.context.impl;

/**
 * Marks a trigger word
 */
public class ConTexTTrigger {
    public enum TriggerType {
        /**
         * Marks the beginning of a context that extends towards the right
         */
        START_RIGHT,
        /**
         * Marks the beginning of a context that extends towards the left
         */
        START_LEFT,
        /**
         * Marks the ending of a context
         */
        TERMINAL,
        /**
         * Marks a pseudo trigger: any triggers that are contained within a pseudo trigger are excluded
         */
        PSEUDO
    }

    /**
     * The context type to which this pertains
     */
    public ConText contextType;

    public int start;
    public int end;

    public ConTexTTrigger(ConText contextType, int start, int end) {
        this.contextType = contextType;
        this.start = start;
        this.end = end;
    }
}
