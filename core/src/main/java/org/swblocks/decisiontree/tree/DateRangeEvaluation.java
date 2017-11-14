/*
 * This file is part of the swblocks-decisiontree library.
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

package org.swblocks.decisiontree.tree;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

import org.swblocks.jbl.util.Range;

/**
 * Evaluation class for evaluating String inputs of {@link Instant} formatted to {@link DateTimeFormatter#ISO_INSTANT}.
 */
public final class DateRangeEvaluation extends GenericRangeEvaluation<Instant> implements Predicate<String> {
    DateRangeEvaluation(String name, Range<Instant> range) {
        super(name, range);
    }

    @Override
    protected Instant parse(String value) {
        return Instant.parse(value);
    }
}
