/**
 * This file is part of SAMM.
 *
 * SAMM is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SAMM is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SAMM.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 */
package pl.edu.agh.samm.common.knowledge;

import java.io.Serializable;

/**
 * @author Pawel Koperek <pkoperek@gmail.com>
 * @author Mateusz Kupisz <mkupisz@gmail.com>
 * 
 */
public class ThresholdOverCriteria implements ICriterion, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 867592383708818685L;
	private double threshold;

	public ThresholdOverCriteria(double threshold) {
		this.threshold = threshold;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pl.edu.agh.samm.common.knowledge.ICriterion#meetsCriterion(java.lang.
	 * Number)
	 */
	@Override
	public boolean meetsCriterion(Number value) {
		double doubleValue = value.doubleValue();
		return doubleValue < threshold;
	}

	@Override
	public String toString() {
		return "Threshold Over: " + threshold;
	}

}
