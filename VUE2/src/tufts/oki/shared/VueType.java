/*
 * -----------------------------------------------------------------------------
 *
 * <p><b>License and Copyright: </b>The contents of this file are subject to the
 * Mozilla Public License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at <a href="http://www.mozilla.org/MPL">http://www.mozilla.org/MPL/.</a></p>
 *
 * <p>Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.</p>
 *
 * <p>The entire file consists of original code.  Copyright &copy; 2003, 2004 
 * Tufts University. All rights reserved.</p>
 *
 * -----------------------------------------------------------------------------
 */

/*
 * VueType.java
 *
 * Created on November 15, 2003, 4:29 PM
 */

package tufts.oki.shared;

import tufts.oki.*;
/**
 *
 * @author  Daisuke Fujiwara
 */
public class VueType extends osid.shared.Type {
    
    public static final String VUE_TYPE_KEY = "osid.shared.VueType";
    
    /** Creates a new instance of VueType */
    public VueType() 
    {
        super ("osid.shared", OsidManager.AUTHORITY, VUE_TYPE_KEY, "This is a Vue Type");
    }
    
}
