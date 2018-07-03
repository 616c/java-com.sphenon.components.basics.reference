package com.sphenon.basics.reference;

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/

import com.sphenon.basics.context.*;

/**
   A reference is an object that contains a somehow complete piece of
   information to uniquely identify a respective target object within some
   namespace.

   In contrast to a {@link com.sphenon.basics.data.DataSource}, neither the
   referenced target object, nor any kind of retrieval service, nor the
   namespace need to be accessible by the reference.

   Typically, References are usable as a parameter to some retrieval service
   to obtain the target object. Sometimes, a Reference can be externalised
   into a String representation and later parser and reconverted into a
   semantically equivalent Reference instance.

   An example of a reference is 'a certain item in a list'.

   Both References and Locators are resolved by some resolution service,
   but in contrast to locators, References (and their respective resolution
   service) are typically more relative and more local, while Locators (and
   their respective resolution service) are more absolute and more universal.
 */
public interface Reference<T> {
    public T get(CallContext context);
}
