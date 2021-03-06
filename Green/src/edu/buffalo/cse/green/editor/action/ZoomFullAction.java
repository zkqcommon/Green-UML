/* This file is part of Green.
 *
 * Copyright (C) 2005 The Research Foundation of State University of New York
 * All Rights Under Copyright Reserved, The Research Foundation of S.U.N.Y.
 * 
 * Green is free software, licensed under the terms of the Eclipse
 * Public License, version 1.0.  The license is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

/**
 * 
 */
package edu.buffalo.cse.green.editor.action;

import org.eclipse.jdt.core.JavaModelException;

import edu.buffalo.cse.green.editor.DiagramEditor;

/**
 * @author zgwang
 *
 */
public class ZoomFullAction extends ContextAction {

	/**
	 * Constructor
	 */
	public ZoomFullAction() {
		setAccelerator('c');
	}
	
	/* (non-Javadoc)
	 * @see edu.buffalo.cse.green.editor.action.ContextAction#doRun()
	 */
	@Override
	protected void doRun() throws JavaModelException {
		DiagramEditor.getActiveEditor().getZoomManager().setZoom(1d);
	}

	/* (non-Javadoc)
	 * @see edu.buffalo.cse.green.editor.action.ContextAction#getLabel()
	 */
	@Override
	public String getLabel() {
		return "Zoom to 100%";
	}

	/* (non-Javadoc)
	 * @see edu.buffalo.cse.green.editor.action.ContextAction#getPath()
	 */
	@Override
	public Submenu getPath() {
		return Submenu.Zoom;
	}

	/* (non-Javadoc)
	 * @see edu.buffalo.cse.green.editor.action.ContextAction#getSupportedModels()
	 */
	@Override
	protected int getSupportedModels() {
		return CM_EDITOR;
	}

	/* (non-Javadoc)
	 * @see edu.buffalo.cse.green.editor.action.ContextAction#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

}
