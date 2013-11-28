/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.shapes.generator.util

import org.eclipselabs.spray.shapes.shape.ShapeDefinition
import org.eclipselabs.spray.shapes.shape.Line
import org.eclipselabs.spray.shapes.shape.RoundedRectangle
import org.eclipselabs.spray.shapes.shape.Polyline
import org.eclipselabs.spray.shapes.shape.Rectangle
import org.eclipselabs.spray.shapes.shape.Polygon
import org.eclipselabs.spray.shapes.shape.Ellipse
import org.eclipselabs.spray.shapes.shape.Text

class ShapeSizeCalculator {
	
	def getContainerSize(ShapeDefinition s) {
		var width = 0
		var height = 0
		for(element : s.shape) {
			var elementSize = element.getSize()
			width = Math::max(width, elementSize.width)
			height = Math::max(height, elementSize.heigth)
		}
		var size = new ShapeSizeWrapper(width, height);
		return size;
	}
	
	def dispatch getSize(Line element){
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Rectangle element){
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Polygon element){
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}		
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Polyline element){
		var maxX = 0
		var maxY = 0
		for(point : element.layout.point) {
			maxX = Math::max(maxX, point.xcor)
			maxY = Math::max(maxY, point.ycor)
		}
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(RoundedRectangle element){
		var maxX = 0
		var maxY = 0		
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Ellipse element){
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
	def dispatch getSize(Text element){
		var maxX = 0
		var maxY = 0
		maxX = element.layout.common.width + element.layout.common.xcor;
		maxY = element.layout.common.heigth + element.layout.common.ycor;
		var size = new ShapeSizeWrapper(maxX, maxY);
		return size;
	}
	
}