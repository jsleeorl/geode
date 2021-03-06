/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.geode.internal.cache.locks;

import java.util.Set;

import org.apache.geode.DataSerializable;

/** Specifies a set of keys to try-lock within the scope of a region */
public interface TXRegionLockRequest extends DataSerializable {

  /** The full path of the region containing the entries to try-lock */
  String getRegionFullPath();

  /** The entries to try-lock. Returns a set of <code>Object</code> names */
  Set getKeys();

  /** add the key to be locked */
  void addEntryKey(Object key);

  /** add the set of keys to be locked */
  void addEntryKeys(Set<Object> s);
}
