/*
 *
 * Copyright 2012-2015 Viant.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package voldemort.utils;

import java.util.Iterator;

/**
 * An iterator that must be closed after use
 * 
 * 
 * @param <T> The type being iterated over
 */
public interface ClosableIterator<T> extends Iterator<T> {

    /**
     * Close the iterator
     */
    public void close();

}
