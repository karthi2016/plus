/* Copyright 2014 MITRE Corporation
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
package org.mitre.provenance.plusobject;

/**
 * An image file.  This is a simple hack used to display images as data items.
 * @author moxious
 */
public class PLUSFileImage extends PLUSFile {
	public static final String PLUS_SUBTYPE_FILE_IMAGE = "file-image";
	
	public PLUSFileImage() { super(); } 
	
	public PLUSFileImage(String filename) { 
		super(filename);
		setOriginalPath(filename); 
		setObjectType(PLUS_TYPE_DATA);
		setObjectSubtype(PLUS_SUBTYPE_FILE_IMAGE);
	}
	
	public PLUSFileImage(String name, String filename) { 
		this(filename);
		setName(name);
		setOriginalPath(filename); 
		setObjectType(PLUS_TYPE_DATA);
		setObjectSubtype(PLUS_SUBTYPE_FILE_IMAGE);
	}
	
	public PLUSFileImage clone() { 
		PLUSFileImage fi = new PLUSFileImage();
		fi.copy(this);
		return fi;
	}	
} // End PLUSFileImage
