/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.cloudhopper.commons.util.windowing;

/**
 * Thrown when the max pending requests have been reached and no more free
 * slots in the "window" open up while a caller is waiting.
 * 
 * @author joelauer
 */
public class MaxWindowSizeTimeoutException extends Exception {
    static final long serialVersionUID = 1L;
    
    public MaxWindowSizeTimeoutException(String msg) {
        super(msg);
    }
    
}