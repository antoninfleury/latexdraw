/*
 * This file is part of LaTeXDraw.
 * Copyright (c) 2005-2018 Arnaud BLOUIN
 * LaTeXDraw is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later version.
 * LaTeXDraw is distributed without any warranty; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */
package net.sf.latexdraw.model.api.shape;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import net.sf.latexdraw.model.api.property.FreeHandProp;

/**
 * The API for freehand shapes.
 * @author Arnaud BLOUIN
 */
public interface Freehand extends FreeHandProp, SingleShape, Closable {
	/**
	 * @return The property of the freehand type.
	 */
	ObjectProperty<FreeHandStyle> typeProperty();

	/**
	 * @return The property of the interval parameter.
	 */
	IntegerProperty intervalProperty();

	@Override
	Freehand duplicate();
}