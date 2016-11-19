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
/**
 * 
 */
package net.sf.reportengine.scenarios;

import java.util.Arrays;
import java.util.List;

import net.sf.reportengine.config.DataColumn;
import net.sf.reportengine.config.DefaultDataColumn;
import net.sf.reportengine.config.DefaultGroupColumn;
import net.sf.reportengine.config.GroupColumn;
import static net.sf.reportengine.config.HorizAlign.CENTER;
import net.sf.reportengine.config.SortType;
import static net.sf.reportengine.config.VertAlign.MIDDLE;
import net.sf.reportengine.core.calc.GroupCalculators;
import net.sf.reportengine.core.calc.CountGroupCalculator;
import net.sf.reportengine.core.calc.SumGroupCalculator;

/**
 * @author dragos
 *
 */
public class SortScenarioWithGroupAndDataCols {
	
	/**
	 * 
	 */
	public static final List<DefaultGroupColumn> GROUPING_COLUMNS = Arrays.asList(
			new DefaultGroupColumn.Builder(0).header("col 0").horizAlign(CENTER).vertAlign(MIDDLE).showDuplicateValues().sortAsc().build(), 
			new DefaultGroupColumn.Builder(1).header("col 1").horizAlign(CENTER).vertAlign(MIDDLE).showDuplicateValues().sortAsc().build(), 
			new DefaultGroupColumn.Builder(2).header("col 2").horizAlign(CENTER).vertAlign(MIDDLE).showDuplicateValues().sortAsc().build()
	);
		
	/**
	 * 
	 */
	public static final List<? extends DataColumn> DATA_COLUMNS = Arrays.asList(
			new DefaultDataColumn.Builder(3).header("col 3").build(), //no ordering
			new DefaultDataColumn.Builder(4).header("col 4").useCalculator(new CountGroupCalculator()).horizAlign(CENTER).vertAlign(MIDDLE).sortAsc(1).build(), 
			new DefaultDataColumn.Builder(5).header("col 5").useCalculator(new SumGroupCalculator()).horizAlign(CENTER).vertAlign(MIDDLE).sortAsc(0).build() //higher order priority
	);
}
