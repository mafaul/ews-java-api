/*
 * The MIT License
 * Copyright (c) 2012 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package microsoft.exchange.webservices.data;

import microsoft.exchange.webservices.data.properties.complex.recurrence.patterns.Recurrence;

import java.util.Date;

/**
 * Represents recurrence range with no end date.
 */
public final class NoEndRecurrenceRange extends RecurrenceRange {

  /**
   * Initializes a new instance.
   */
  public NoEndRecurrenceRange() {
    super();
  }

  /**
   * Initializes a new instance.
   *
   * @param startDate the start date
   */
  public NoEndRecurrenceRange(Date startDate) {
    super(startDate);
  }

  /**
   * Gets the name of the XML element.
   *
   * @return The name of the XML element
   */
  public String getXmlElementName() {
    return XmlElementNames.NoEndRecurrence;
  }

  /**
   * Setups the recurrence.
   *
   * @param recurrence the new up recurrence
   * @throws Exception the exception
   */
  public void setupRecurrence(Recurrence recurrence) throws Exception {
    super.setupRecurrence(recurrence);

    recurrence.neverEnds();
  }

}
