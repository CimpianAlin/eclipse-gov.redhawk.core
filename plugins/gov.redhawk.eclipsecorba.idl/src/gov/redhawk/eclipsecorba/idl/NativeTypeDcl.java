/** 
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 * 
 * This file is part of REDHAWK IDE.
 * 
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 *
 */

// BEGIN GENERATED CODE
package gov.redhawk.eclipsecorba.idl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Type Dcl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.redhawk.eclipsecorba.idl.NativeTypeDcl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.redhawk.eclipsecorba.idl.IdlPackage#getNativeTypeDcl()
 * @model
 * @generated
 */
public interface NativeTypeDcl extends IdlTypeDcl {

	/**
	 * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarator</em>' containment reference.
	 * @see #setDeclarator(Declarator)
	 * @see gov.redhawk.eclipsecorba.idl.IdlPackage#getNativeTypeDcl_Declarator()
	 * @model containment="true"
	 * @generated
	 */
	Declarator getDeclarator();

	/**
	 * Sets the value of the '{@link gov.redhawk.eclipsecorba.idl.NativeTypeDcl#getDeclarator <em>Declarator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarator</em>' containment reference.
	 * @see #getDeclarator()
	 * @generated
	 */
	void setDeclarator(Declarator value);

} // NativeTypeDcl
