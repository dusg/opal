/*******************************************************************************
 * Copyright (c) 2011 Laurent CARON.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Laurent CARON (laurent.caron@gmail.com) - initial API and implementation
 *******************************************************************************/
package org.mihalis.opal.transitionComposite;

/**
 * In this transition, both control are sliding (vertical movement, up to down)
 */
public class UpDownTransition extends VerticalTransition {

	@Override
	protected int getCoeff() {
		return 1;
	}

	@Override
	protected boolean secondIsBehind() {
		return true;
	}
}
