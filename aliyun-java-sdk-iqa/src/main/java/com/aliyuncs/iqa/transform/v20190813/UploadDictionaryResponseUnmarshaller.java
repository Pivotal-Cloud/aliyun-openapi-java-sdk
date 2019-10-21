/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iqa.transform.v20190813;

import com.aliyuncs.iqa.model.v20190813.UploadDictionaryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDictionaryResponseUnmarshaller {

	public static UploadDictionaryResponse unmarshall(UploadDictionaryResponse uploadDictionaryResponse, UnmarshallerContext _ctx) {
		
		uploadDictionaryResponse.setRequestId(_ctx.stringValue("UploadDictionaryResponse.RequestId"));
		uploadDictionaryResponse.setProjectId(_ctx.stringValue("UploadDictionaryResponse.ProjectId"));
		uploadDictionaryResponse.setTotalCount(_ctx.integerValue("UploadDictionaryResponse.TotalCount"));
		uploadDictionaryResponse.setFileDataCount(_ctx.integerValue("UploadDictionaryResponse.FileDataCount"));
		uploadDictionaryResponse.setJsonDataCount(_ctx.integerValue("UploadDictionaryResponse.JsonDataCount"));
	 
	 	return uploadDictionaryResponse;
	}
}