/*
 *  Copyright 2009 Martin Traverso
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.proofpoint.reporting;

// Annotation inherited from parent class and multiple interfaces => A
public class TestInheritance7
        extends TestInheritanceBase
{
    public TestInheritance7()
    {
        super(B.class, A.class);
    }

    private static class A
    {
        @Reported
        protected Object getValue()
        {
            return null;
        }
    }

    private static class B
            extends A
            implements C, D
    {
        public Object getValue()
        {
            return null;
        }
    }

    private static interface C
    {
        @Reported
        Object getValue();
    }

    private static interface D
    {
        @Reported
        Object getValue();
    }

}