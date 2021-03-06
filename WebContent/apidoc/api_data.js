define({ "api": [
  {
    "type": "post",
    "url": "/v1/ktts/countEntityByUser",
    "title": "WS đếm số lượng tài sản theo cá nhân, BBBG, số BBBG chưa xác nhận",
    "name": "countEntityByUser",
    "group": "KTTS",
    "description": "<p>WS đếm số lượng tài sản theo cá nhân, BBBG, số BBBG chưa xác nhận,</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "employeeId",
            "description": "<p>mã nhân viên (109, 169202),</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "type",
            "description": "<p>(Optional) Loại, 1 - count tài sản theo cá nhân, 2 - count BBBG, 3 - count BBBG chưa xác nhận</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "keyword",
            "description": "<p>(Optional) Từ khóa</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"employeeId\":\"169202\",\"type\":1}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>số lượng tài sản theo cá nhân</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"return\":8},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/KttsApi.java",
    "groupTitle": "KTTS"
  },
  {
    "type": "post",
    "url": "/v1/ktts/getListEntityByUser",
    "title": "WS danh sách tài sản theo cá nhân (bao gồm chi tiết sản phẩm)",
    "name": "getListEntityByUser",
    "group": "KTTS",
    "description": "<p>WS danh sách tài sản theo cá nhân (bao gồm chi tiết sản phẩm)</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "employeeId",
            "description": "<p>mã nhân viên, (109, 169202)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "keyword",
            "description": "<p>(Optional) Từ khóa</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "start",
            "description": "<p>Vị trí bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "limit",
            "description": "<p>Số lượng bản ghi</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"employeeId\":\"169202\",\"start\":\"0\",\"limit\":\"10\"}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "MerEntityId",
            "description": "<p>Danh sách tài sản</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"listMerEntity\":[{\"assetPrice\":1200.0,\"catEmployeeId\":521,\"catMerCode\":\"TC100\",\"catMerName\":\"THE CAO MG 100\",\"count\":1.0,\"entityType\":0,\"isDevice\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414419201757,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000011\",\"minuteHandOverDate\":1492534800000,\"restTime\":12,\"serialNumber\":\"SN019647HONG\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"bộ\",\"usedDate\":1317747600000},{\"catEmployeeId\":521,\"catMerCode\":\"037093\",\"catMerName\":\"MPĐ_ Italia_250KVA_GP280_Dầu_Có vỏ chống ồn\",\"companyName\":\"?n Độ\",\"count\":1.0,\"entityType\":0,\"isDevice\":1,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414420668236,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000010\",\"minuteHandOverDate\":1492534800000,\"restTime\":12,\"serialNumber\":\"SN91320132034\",\"stationCode\":\"BGG158\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"chiếc\"},{\"catEmployeeId\":521,\"catMerCode\":\"CXD_VT\",\"catMerName\":\"Chưa xác định vật tư\",\"count\":1.0,\"entityType\":0,\"isDevice\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414419237547,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000009\",\"minuteHandOverDate\":1492534800000,\"restTime\":12,\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"bộ\",\"usedDate\":1444237200000},{\"assetPrice\":25000.0,\"catEmployeeId\":521,\"catMerCode\":\"002890\",\"catMerName\":\"Cáp quang treo 4Fo\",\"companyName\":\"Huawei-TQ\",\"count\":3.0,\"entityType\":0,\"isDevice\":0,\"isReject\":false,\"isWarranty\":0,\"lifeTime\":16,\"merEntityId\":1414420755207,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000009\",\"minuteHandOverDate\":1492534800000,\"privateManagerName\":\" Đã báo hỏng: 1; Đã báo KSD: 1;\",\"restTime\":4,\"restValue\":18750.0,\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"m\",\"usedDate\":1460566800000},{\"catEmployeeId\":521,\"catMerCode\":\"002878\",\"catMerName\":\"Cáp Đồng Treo 1000x2x0,4\",\"count\":1.0,\"entityType\":0,\"isDevice\":0,\"isReject\":false,\"isWarranty\":0,\"lifeTime\":16,\"merEntityId\":1414420755204,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000008\",\"minuteHandOverDate\":1492448400000,\"restTime\":12,\"stationCode\":\"HNI1990-HNI0017_HNI1547-HNI1749\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"m\"},{\"assetPrice\":123.0,\"catEmployeeId\":521,\"catMerCode\":\"SAMSUNGE1100T\",\"catMerName\":\"Máy điện thoại Samsung E1100T\",\"companyName\":\"Hãng thêm mới\",\"count\":1.0,\"entityType\":0,\"isDevice\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414419238184,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000007\",\"minuteHandOverDate\":1492448400000,\"restTime\":12,\"stationCode\":\"DBN219\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"Lọ\",\"usedDate\":1505494800000},{\"assetPrice\":1.0,\"catEmployeeId\":521,\"catMerCode\":\"003159\",\"catMerName\":\"Cục lạnh điều hòa Panasonic 12000BT\",\"companyName\":\"ERICSSON\",\"count\":1.0,\"entityType\":0,\"isDevice\":1,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414415522353,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000007\",\"minuteHandOverDate\":1492448400000,\"restTime\":12,\"serialNumber\":\"SAE55697618\",\"stationCode\":\"SFONE-QTOAN\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"card\",\"usedDate\":1467910800000},{\"assetPrice\":400000.0,\"catEmployeeId\":521,\"catMerCode\":\"003860\",\"catMerName\":\"Bản cam kết\",\"companyName\":\"Samsung\",\"count\":1.0,\"entityType\":0,\"isDevice\":0,\"isReject\":false,\"isWarranty\":0,\"lifeTime\":3,\"merEntityId\":1414419235081,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000006\",\"minuteHandOverDate\":1492448400000,\"restTime\":12,\"restValue\":1600000.0,\"stationCode\":\"HNI5045\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"tờ\",\"usedDate\":1406307600000},{\"assetPrice\":500000.0,\"catEmployeeId\":521,\"catMerCode\":\"001610\",\"catMerName\":\"Backplane Of Giga Universal Service Network\",\"companyName\":\"bfds\",\"count\":1.0,\"entityType\":0,\"isDevice\":1,\"isReject\":false,\"isWarranty\":0,\"lifeTime\":4,\"merEntityId\":1414419238196,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000006\",\"minuteHandOverDate\":1492448400000,\"restTime\":12,\"restValue\":1500000.0,\"serialNumber\":\"CT22092016000\",\"stationCode\":\"HNI5053\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"bộ\",\"usedDate\":1455469200000},{\"assetPrice\":1.0,\"catEmployeeId\":521,\"catMerCode\":\"003159\",\"catMerName\":\"Cục lạnh điều hòa Panasonic 12000BT\",\"companyName\":\"ERICSSON\",\"count\":1.0,\"entityType\":0,\"isDevice\":1,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414415522351,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000006\",\"minuteHandOverDate\":1492448400000,\"restTime\":12,\"serialNumber\":\"SAE53577067\",\"stationCode\":\"SFONE-QTOAN\",\"statusName\":\"Đang sử dụng\",\"stt\":0,\"unitName\":\"card\",\"usedDate\":1467910800000}],\"status\":\"Success\"},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/KttsApi.java",
    "groupTitle": "KTTS"
  },
  {
    "type": "post",
    "url": "/v1/ktts/getListEntityInHan",
    "title": "WS danh sách tài sản trong BBBG TSCN (có phân trang)",
    "name": "getListEntityInHan",
    "group": "KTTS",
    "description": "<p>WS danh sách tài sản trong BBBG TSCN (có phân trang)</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "idBBBGTSCN",
            "description": "<p>Id của BBBGTSCN</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "start",
            "description": "<p>Vị trí bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "limit",
            "description": "<p>Số lượng bản ghi</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"idBBBGTSCN\":\"1862\",\"start\":0,\"limit\":10}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>thành công</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"listMerEntity\":[{\"assetPrice\":1.95E7,\"catMerCode\":\"000505\",\"catMerName\":\"16??8.5 grounding copper bar\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414417052870,\"minuteHandOverId\":1862,\"restTime\":12,\"stationCode\":\"TRAM_G_TONG_TRAM_CNT\",\"statusName\":\"Chưa sử dụng\",\"stt\":0,\"unitName\":\"bộ\"},{\"assetPrice\":1.95E7,\"catMerCode\":\"000505\",\"catMerName\":\"16??8.5 grounding copper bar\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414417055635,\"minuteHandOverId\":1862,\"restTime\":12,\"stationCode\":\"TRAM_G_TONG_TRAM_CNT\",\"statusName\":\"Chưa sử dụng\",\"stt\":0,\"unitName\":\"bộ\"},{\"assetPrice\":1.95E7,\"catMerCode\":\"000505\",\"catMerName\":\"16??8.5 grounding copper bar\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414417053418,\"minuteHandOverId\":1862,\"restTime\":12,\"stationCode\":\"TRAM_G_TONG_TRAM_CNT\",\"statusName\":\"Chưa sử dụng\",\"stt\":0,\"unitName\":\"bộ\"},{\"assetPrice\":1.95E7,\"catMerCode\":\"000505\",\"catMerName\":\"16??8.5 grounding copper bar\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414417055131,\"minuteHandOverId\":1862,\"restTime\":12,\"stationCode\":\"TRAM_G_TONG_TRAM_CNT\",\"statusName\":\"Chưa sử dụng\",\"stt\":0,\"unitName\":\"bộ\"},{\"assetPrice\":100000.0,\"catMerCode\":\"008586\",\"catMerName\":\"HUB 8 cổng 10/100 Planet\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414411236905,\"minuteHandOverId\":1862,\"restTime\":12,\"serialNumber\":\"6550\",\"stationCode\":\"TT.HGG002\",\"statusName\":\"Hỏng\",\"stt\":0,\"unitName\":\"chiếc\"},{\"assetPrice\":100000.0,\"catMerCode\":\"008589\",\"catMerName\":\"Hệ thống giá đỡ và lồng điều hòa cho nhà trạm C408\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414411236906,\"minuteHandOverId\":1862,\"restTime\":12,\"serialNumber\":\"6553\",\"stationCode\":\"TT.HGG002\",\"statusName\":\"Hỏng\",\"stt\":0,\"unitName\":\"Bộ\"},{\"assetPrice\":100000.0,\"catMerCode\":\"008590\",\"catMerName\":\"Thang cáp trong nhà Container (sửa từ thang cáp Huawei) (1bộ = m)\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414411236907,\"minuteHandOverId\":1862,\"restTime\":12,\"serialNumber\":\"6554\",\"stationCode\":\"TT.HGG002\",\"statusName\":\"Hỏng\",\"stt\":0,\"unitName\":\"Bộ\"},{\"assetPrice\":100000.0,\"catMerCode\":\"008592\",\"catMerName\":\"Dây điện thoại có gia cường (2x0,65) + (7x0,4)\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414411236909,\"minuteHandOverId\":1862,\"restTime\":12,\"serialNumber\":\"6556\",\"stationCode\":\"TT.HGG002\",\"statusName\":\"Hỏng\",\"stt\":0,\"unitName\":\"mét\"},{\"assetPrice\":100000.0,\"catMerCode\":\"008593\",\"catMerName\":\"Mực in Hp 1160\",\"count\":1.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414411236910,\"minuteHandOverId\":1862,\"restTime\":12,\"serialNumber\":\"6557\",\"stationCode\":\"TT.HGG002\",\"statusName\":\"Hỏng\",\"stt\":0,\"unitName\":\"Cái\"},{\"assetPrice\":1.0,\"catMerCode\":\"006549\",\"catMerName\":\"?ng nhựa thoát nước cục lạnh\",\"companyName\":\"Viet Nam\",\"count\":2.0,\"entityType\":0,\"isReject\":false,\"isWarranty\":0,\"merEntityId\":1414419237441,\"minuteHandOverId\":1862,\"nodeCode\":\"MSS111111\",\"restTime\":12,\"stationCode\":\"TT.HGG007\",\"statusName\":\"Chưa sử dụng\",\"stt\":0,\"unitName\":\"m\"}],\"status\":\"Success\"},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/KttsApi.java",
    "groupTitle": "KTTS"
  },
  {
    "type": "post",
    "url": "/v1/ktts/getListHandoverByUser",
    "title": "WS danh sách BBBG TSCN theo cá nhân",
    "name": "getListHandoverByUser",
    "group": "KTTS",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "employeeId",
            "description": "<p>mã nhân viên,</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>(không bắt buộc) trạng thái của BBBG, 0- dang ban giao; 1- da xac nhan; 2- da tu choi</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "keyword",
            "description": "<p>(Optional) Từ khóa</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "start",
            "description": "<p>Vị trí bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "limit",
            "description": "<p>Số lượng bản ghi</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"employeeId\":169202,\"status\":1,\"start\":0,\"limit\":10}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>thành công</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"listMinuteHandOver\":[{\"acceptDescription\":null,\"countAsset\":1,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"test\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000011\",\"minuteHandOverDate\":1492534800000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2834,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":2,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"tet Ã¡dgf\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000010\",\"minuteHandOverDate\":1492534800000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2833,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":2,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"test\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000009\",\"minuteHandOverDate\":1492534800000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2832,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":2,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"test abc\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000008\",\"minuteHandOverDate\":1492448400000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2831,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":3,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"thunt35 test\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000007\",\"minuteHandOverDate\":1492448400000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2830,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":3,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"test\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000006\",\"minuteHandOverDate\":1492448400000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2829,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":3,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":\"Từ chối\",\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000005\",\"minuteHandOverDate\":1492362000000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2828,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null},{\"acceptDescription\":null,\"countAsset\":5,\"createdDate\":null,\"creatorId\":null,\"creatorName\":null,\"description\":null,\"employeeMinuteHandOVerName\":\"Đỗ Thu Hà\",\"employeeMinuteHandOverCode\":\"050166\",\"employeeMinuteReceiverCode\":null,\"employeeMinuteReceiverName\":null,\"employeeSignCode\":null,\"employeeSignName\":null,\"groupId\":null,\"groupName\":null,\"isActive\":null,\"minuteHandOverCode\":\"BBBG_TSCN_TCT/17/000004\",\"minuteHandOverDate\":1491930000000,\"minuteHandOverGiverId\":null,\"minuteHandOverId\":2827,\"minuteHandOverReceiverId\":null,\"minuteHandOverSignId\":null,\"status\":1,\"statusName\":null,\"type\":null}],\"status\":\"Success\"},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/KttsApi.java",
    "groupTitle": "KTTS"
  },
  {
    "type": "post",
    "url": "/v1/ktts/updateStatusEntity",
    "title": "WS báo hỏng/ báo mất/ báo không sử dụng",
    "name": "updateStatusEntity",
    "group": "KTTS",
    "description": "<p>WS báo hỏng/ báo mất/ báo không sử dụng</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "merEntityId",
            "description": "<p>Id tài sản</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "count",
            "description": "<p>Số lượng</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "date",
            "description": "<p>Ngày</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>tình trạng của tài sản viết trong BBBG (1 - báo mất , 2 - báo hỏng, 3 - báo không sử dụng)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "reason",
            "description": "<p>Lý do</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>thành công</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/KttsApi.java",
    "groupTitle": "KTTS"
  },
  {
    "type": "post",
    "url": "/v1/ktts/updateTypeInHan",
    "title": "WS xác nhận/ từ chối BBBG TSCN",
    "name": "updateTypeInHan",
    "group": "KTTS",
    "description": "<p>WS xác nhận/ từ chối BBBG TSCN</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "idBBBGTSCN",
            "description": "<p>Id của BBBGTSCN</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "reason",
            "description": "<p>Lý do</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>(không bắt buộc) Loại 1 - báo mất , 2 - báo hỏng, 3 - báo không sử dụng</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "Result",
            "description": "<p>Success/Error</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"status\":\"Success\"},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/KttsApi.java",
    "groupTitle": "KTTS"
  },
  {
    "type": "post",
    "url": "/v1/qltt/authenticate",
    "title": "Xác thực account",
    "name": "authenticate",
    "group": "QLTT",
    "description": "<p>Xác thực account để lấy thông tin Authentication token</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userName",
            "description": "<p>user name of user</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>password of user</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "test",
            "description": "<p>extra information</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"userName\":\"dongnd8\",\"password\":\"test\",\"test\":\"hehe\"}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "ClientResponse",
            "description": "<p>đăng nhập thành công</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"userName\":\"dongnd8\",\"password\":\"test\",\"test\":\"hehe\"}",
          "type": "json"
        }
      ]
    },
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "UserNotFound",
            "description": "<p>The id of the User was not found.</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/QlttApi.java",
    "groupTitle": "QLTT"
  },
  {
    "type": "post",
    "url": "/v1/qltt/downloadFile",
    "title": "download tải liệu -> lấy file về để preview.",
    "name": "downloadFile",
    "group": "QLTT",
    "description": "<p>API download tải liệu -&gt; lấy file về để preview. Data test: document/20160411/520078/Nn0kDqF2lBxOJPLU83IPvfK38A=.pdf,</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "filePath",
            "description": "<p>Path đến file cần download</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"filePath\":\"document/20160411/520078/Nn0kDqF2lBxOJPLU83IPvfK38A=.pdf\"}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "data",
            "description": "<p>String được mã hóa từ dữ liệu dang byte[] của file bằng sun.misc.BASE64Decoder</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":\"MDMwMzI3NSAwMDAwMCBuDQowMDAw\\nMzAz...\",\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/QlttApi.java",
    "groupTitle": "QLTT"
  },
  {
    "type": "post",
    "url": "/v1/qltt/getDocumentCategory",
    "title": "list case thư mục tài liệu để browser.",
    "name": "getDocumentCategory",
    "group": "QLTT",
    "description": "<p>APIs list case thư mục tài liệu để browser.</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "documentCategoryId",
            "description": "<p>ID của DocumentCategory</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "type",
            "description": "<p>type: 1 lấy toàn bộ cây thư mục, 2 lấy toàn bộ lĩnh vực con bắt đầu từ id, 3 lấy lĩnh vực con cấp 1 từ id.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"documentCategoryId\":2051,\"type\":1}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "DocumentCategoryServiceBean",
            "description": "<p>nội dung thông tin trả về gồm ít nhất các thông tin trên + ảnh đại diện của tài liệu, có thể thêm một số trường có sẵn cũng được.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"result\":[{\"documentId\":5102,\"code\":\"CTKT.00.KT.129\",\"name\":\"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý\",\"description\":\"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý màn hình tập trung\",\"authorName\":\"TT Sơn\",\"documentCategory\":null,\"docCategoryName\":\"Programming language\",\"status\":null,\"statusName\":\"Còn hiệu lực\",\"type\":null,\"fileAttachment\":[{\"fileAttachmentId\":1001743,\"filePath\":\"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf\",\"fileName\":\"javaForTesters-sample.pdf\",\"parentId\":5109,\"createdDate\":null,\"createdUser\":null,\"modifiedDate\":null,\"modifiedUser\":null,\"status\":null,\"type\":null,\"fileType\":null,\"fileSize\":null,\"compareById\":true}]},{\"documentId\":5109,\"code\":\"877/QĐ-VTQĐ-TCNL\",\"name\":\"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)\",\"description\":\"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)\",\"authorName\":\"TT Hùng\",\"documentCategory\":null,\"docCategoryName\":\"Telecommunication\",\"status\":null,\"statusName\":\"Còn hiệu lực\",\"type\":null,\"fileAttachment\":[{\"fileAttachmentId\":1001743,\"filePath\":\"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf\",\"fileName\":\"javaForTesters-sample.pdf\",\"parentId\":5109,\"createdDate\":null,\"createdUser\":null,\"modifiedDate\":null,\"modifiedUser\":null,\"status\":null,\"type\":null,\"fileType\":null,\"fileSize\":null,\"compareById\":true}]},{\"documentId\":2020,\"code\":\"GL.VTQD.NCSX.12\",\"name\":\"Guideline tính giá trị sản lượng của các đơn vị khối NCSX\",\"description\":\"Guideline tính giá trị sản lượng của các đơn vị khối NCSX\",\"authorName\":\"TT Chiến\",\"documentCategory\":null,\"docCategoryName\":\"Infrastructure, Construction\",\"status\":null,\"statusName\":\"Hết hiệu lực\",\"type\":null,\"fileAttachment\":[{\"fileAttachmentId\":1001743,\"filePath\":\"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf\",\"fileName\":\"javaForTesters-sample.pdf\",\"parentId\":5109,\"createdDate\":null,\"createdUser\":null,\"modifiedDate\":null,\"modifiedUser\":null,\"status\":null,\"type\":null,\"fileType\":null,\"fileSize\":null,\"compareById\":true}]}]},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/QlttApi.java",
    "groupTitle": "QLTT"
  },
  {
    "type": "post",
    "url": "/v1/qltt/getDocumentInfo",
    "title": "Tra cứu tài liệu theo các tiêu chí",
    "name": "getDocumentInfo",
    "group": "QLTT",
    "description": "<p>Tra cứu tài liệu theo các tiêu chí (nếu PMTH cung cấp được dạng keyword chung)</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>Tên tài liệu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>Mã tài liệu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "description",
            "description": "<p>Nội dung tài liệu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "authorName",
            "description": "<p>Tác giả tài liệu</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "type",
            "description": "<p>Trạng thái tài liệu (0: search theo mục, 1: tài liệu được xem nhiều nhất, 2: tài liệu mới nhất)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"name\":\"Ten tai lieu\",\"code\":\"ma tai lieu\",\"description\":\"mo ta\",\"authorName\":\"ten tac gia\",\"type\":\"0\"}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "documentServiceBean",
            "description": "<p>nội dung thông tin trả về gồm ít nhất các thông tin trên + ảnh đại diện của tài liệu, có thể thêm một số trường có sẵn cũng được.</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"result\":[{\"documentId\":5102,\"code\":\"CTKT.00.KT.129\",\"name\":\"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý\",\"description\":\"Bộ Chỉ tiêu kỹ thuật cơ bản cho hệ thống quản lý màn hình tập trung\",\"authorName\":\"TT Sơn\",\"documentCategory\":null,\"docCategoryName\":\"Programming language\",\"status\":null,\"statusName\":\"Còn hiệu lực\",\"type\":null,\"fileAttachment\":[{\"fileAttachmentId\":1001743,\"filePath\":\"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf\",\"fileName\":\"javaForTesters-sample.pdf\",\"parentId\":5109,\"createdDate\":null,\"createdUser\":null,\"modifiedDate\":null,\"modifiedUser\":null,\"status\":null,\"type\":null,\"fileType\":null,\"fileSize\":null,\"compareById\":true}]},{\"documentId\":5109,\"code\":\"877/QĐ-VTQĐ-TCNL\",\"name\":\"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)\",\"description\":\"QĐ ban hành Quy định về xử lý kỷ luật với cán bộ, nhân viên trong Tập đoàn Viễn thông Quân đội (bản sửa đổi, bổ sung)\",\"authorName\":\"TT Hùng\",\"documentCategory\":null,\"docCategoryName\":\"Telecommunication\",\"status\":null,\"statusName\":\"Còn hiệu lực\",\"type\":null,\"fileAttachment\":[{\"fileAttachmentId\":1001743,\"filePath\":\"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf\",\"fileName\":\"javaForTesters-sample.pdf\",\"parentId\":5109,\"createdDate\":null,\"createdUser\":null,\"modifiedDate\":null,\"modifiedUser\":null,\"status\":null,\"type\":null,\"fileType\":null,\"fileSize\":null,\"compareById\":true}]},{\"documentId\":2020,\"code\":\"GL.VTQD.NCSX.12\",\"name\":\"Guideline tính giá trị sản lượng của các đơn vị khối NCSX\",\"description\":\"Guideline tính giá trị sản lượng của các đơn vị khối NCSX\",\"authorName\":\"TT Chiến\",\"documentCategory\":null,\"docCategoryName\":\"Infrastructure, Construction\",\"status\":null,\"statusName\":\"Hết hiệu lực\",\"type\":null,\"fileAttachment\":[{\"fileAttachmentId\":1001743,\"filePath\":\"document/20160226/520070/869D5nHCRmyhJpptRRy5dXVFx18=.pdf\",\"fileName\":\"javaForTesters-sample.pdf\",\"parentId\":5109,\"createdDate\":null,\"createdUser\":null,\"modifiedDate\":null,\"modifiedUser\":null,\"status\":null,\"type\":null,\"fileType\":null,\"fileSize\":null,\"compareById\":true}]}]},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/QlttApi.java",
    "groupTitle": "QLTT"
  },
  {
    "type": "post",
    "url": "/v1/qltt/getTypePermission",
    "title": "Lấy type quyền account",
    "name": "getTypePermission",
    "group": "QLTT",
    "description": "<p>API lấy type quyền account (nếu cần thiết), hiện mình chỉ cho view giống nhau thì có thể chưa gấp cái này. Chưa làm.</p>",
    "parameter": {
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>thành công</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/QlttApi.java",
    "groupTitle": "QLTT"
  },
  {
    "type": "get",
    "url": "/compassionate-leave",
    "title": "lấy danh sách nghỉ bởi ID đơn xin nghỉ hoặc loại",
    "name": "compassionate_leave",
    "group": "TTNS_CompassionateLeave",
    "description": "<p>18.1. APIs lấy danh sách nghỉ của nhân viên. <br> http://localhost:8080/smartoffice/api/v1/ttns/compassionate-leave</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "personalFormId",
            "description": "<p>Id đơn xin nghỉ phép - not required</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>Loại đơn xin nghỉ {1: Xin nghỉ phép, 3: Xin nghỉ ốm, 5: xin nghỉ con ốm, 7: Xin nghỉ việc riêng } - not required</p>"
          }
        ]
      }
    },
    "examples": [
      {
        "title": "Example usage:",
        "content": "curl -i http://localhost:8080/smartoffice/api/v1/ttns/compassionate-leave?type=0&personalFormId=1189",
        "type": "curl"
      }
    ],
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>danh sách nghỉ của nhân viên</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":[{\"personalFormId\":1189,\"empoyeeId\":461856,\"type\":1,\"organizationId\":164648,\"reason\":\"đơn xin nghỉ phép 7/4\",\"fromDate\":1491526800000,\"toDate\":1491561000000,\"phoneNumber\":\"01657678657\",\"stayAddress\":\"CN Viettel Hà Giang\",\"employeeReplaceId\":null,\"positionReplace\":null,\"resolveScope\":null,\"position\":\"PBan Doanh thu hàng hoá\",\"status\":1,\"createdDate\":1490762056000,\"currentAddress\":\"Mễ trì hạ - nam Từ Liêm - hà Nội\",\"modifyDate\":null,\"title\":null,\"department\":\"CHỈ HUY ĐƠN VỊ\",\"titleSiger1\":\"NGƯỜI KÝ 1\",\"titleSiger2\":null,\"titleSiger3\":null,\"titleSiger4\":null}],\"entityType\":\"java.util.ArrayList\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS_CompassionateLeave"
  },
  {
    "type": "post",
    "url": "/:id/compassionate-leave/delete",
    "title": "Xóa đăng kí nghỉ của nhân viên",
    "name": "compassionate_leave_delete",
    "group": "TTNS_CompassionateLeave",
    "description": "<p>APIs xóa đăng kí nghỉ của nhân viên<br> http://10.58.71.138:8765/TTNSWebService/api/v1/employee/{id}/compassionate-leave/delete</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "form_type_id",
            "description": "<p>Id loại đơn xin nghỉ 1: xóa đơn xin nghỉ phép 3: Xóa đơn xin nghỉ ốm 5: Xóa đơn xin nghỉ con ốm 7: xóa đơn xin nghỉ việc riêng.</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "personal_form_id",
            "description": "<p>Id đơn xin nghỉ</p>"
          }
        ]
      }
    },
    "examples": [
      {
        "title": "Example usage:",
        "content": "curl -i http://localhost:8080/smartoffice/api/v1/ttns/41387/compassionate-leave/delete",
        "type": "curl"
      }
    ],
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":\"Suscess\",\"entityType\":\"java.lang.String\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS_CompassionateLeave"
  },
  {
    "type": "get",
    "url": "/:id/compassionate-leave",
    "title": "lấy danh sách nghỉ của nhân viên",
    "name": "compassionate_leave_employee",
    "group": "TTNS_CompassionateLeave",
    "description": "<ol start=\"18\"> <li>APIs lấy danh sách nghỉ của nhân viên. <br> http://localhost:8080/smartoffice/api/v1/ttns/{id}/compassionate-leave</li> </ol>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "type",
            "description": "<p>Loại đơn xin nghỉ {0: Lấy tất cả,1:Xin nghỉ phép,3 : Xin nghỉ ốm,5: xin nghỉ con ốm,7: Xin nghỉ việc riêng }</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_date",
            "description": "<p>Thời gian xin nghỉ từ ngày (Không bắt buộc)</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "to_date",
            "description": "<p>Thời gian xin nghỉ đến ngày (Không bắt buộc)</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>Trạng thái Trình ký { 0:Chưa trình ký,1:Đã phê duyệt,2:Từ chối phê duyệt,3:Đang chờ phê duyệt} (Không bắt buộc)</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>danh sách nghỉ của nhân viên</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":[{\"type\":1,\"fromDate\":1472691600000,\"toDate\":1473417000000,\"status\":1},{\"type\":1,\"fromDate\":1473814800000,\"toDate\":1473935400000,\"status\":2},{\"type\":1,\"fromDate\":1473814800000,\"toDate\":1473849000000,\"status\":3},{\"type\":1,\"fromDate\":1473901200000,\"toDate\":1474021800000,\"status\":2},{\"type\":3,\"fromDate\":1444440000000,\"toDate\":1444872600000,\"status\":3},{\"type\":3,\"fromDate\":1444439700000,\"toDate\":1444879800000,\"status\":3},{\"type\":3,\"fromDate\":1441674540000,\"toDate\":1440637680000,\"status\":3},{\"type\":3,\"fromDate\":1476950400000,\"toDate\":1476954000000,\"status\":0},{\"type\":3,\"fromDate\":1476954000000,\"toDate\":1476961200000,\"status\":3},{\"type\":3,\"fromDate\":1436947620000,\"toDate\":1436861220000,\"status\":3},{\"type\":3,\"fromDate\":1473670560000,\"toDate\":1473756960000,\"status\":0},{\"type\":5,\"fromDate\":1436724420000,\"toDate\":1440094080000,\"status\":0},{\"type\":5,\"fromDate\":1438135620000,\"toDate\":1441418940000,\"status\":3},{\"type\":5,\"fromDate\":1477101600000,\"toDate\":1479787200000,\"status\":0},{\"type\":7,\"fromDate\":1279577040000,\"toDate\":1441017000000,\"status\":3},{\"type\":7,\"fromDate\":1438402080000,\"toDate\":1440821280000,\"status\":3},{\"type\":7,\"fromDate\":1444036200000,\"toDate\":1446282600000,\"status\":0},{\"type\":7,\"fromDate\":1444440600000,\"toDate\":1444872600000,\"status\":3},{\"type\":7,\"fromDate\":1439456880000,\"toDate\":1439284080000,\"status\":3},{\"type\":7,\"fromDate\":1444440600000,\"toDate\":1444872000000,\"status\":3},{\"type\":7,\"fromDate\":1461204240000,\"toDate\":1461377040000,\"status\":0},{\"type\":7,\"fromDate\":1444461600000,\"toDate\":1444905000000,\"status\":3},{\"type\":7,\"fromDate\":1436242020000,\"toDate\":1437797220000,\"status\":0},{\"type\":7,\"fromDate\":1438229220000,\"toDate\":1436155620000,\"status\":0}],\"entityType\":\"java.util.ArrayList\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS_CompassionateLeave"
  },
  {
    "type": "post",
    "url": "/:id/compassionate-leave/sign",
    "title": "trình ký đăng kí nghỉ của nhân viên",
    "name": "compassionate_leave_sign",
    "group": "TTNS_CompassionateLeave",
    "description": "<p>APIs trình ký đăng kí nghỉ của nhân viên. <br> http://localhost:8080/smartoffice/api/v1/ttns/{id}/compassionate-leave/sign</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "type",
            "description": "<p>Id loại đơn xin nghỉ</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":\"Thành công\",\"entityType\":\"java.lang.StringBuilder\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS_CompassionateLeave"
  },
  {
    "type": "post",
    "url": "/:id/compassionate-leave",
    "title": "đăng kí/update nghỉ của nhân viên",
    "name": "register_update_compassionate_leave",
    "group": "TTNS_CompassionateLeave",
    "description": "<ol start=\"19\"> <li>APIs đăng kí nghỉ của nhân viên . <br> http://localhost:8080/smartoffice/api/v1/ttns/{id}/compassionate-leave</li> </ol>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "type",
            "description": "<p>Loại đơn xin nghỉ {0: Lấy tất cả, 1: Xin nghỉ phép, 3: Xin nghỉ ốm, 5: xin nghỉ con ốm, 7: Xin nghỉ việc riêng }</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>ID đăng kí nghỉ (Không bắt buộc)</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_date",
            "description": "<p>Thời gian xin nghỉ từ ngày</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "to_date",
            "description": "<p>Thời gian xin nghỉ đến ngày</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "reason",
            "description": "<p>Lý do (Không bắt buộc với các trường hợp xin Nghỉ con ốm, xin nghỉ ốm)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type_resign",
            "description": "<p>Loại hình nghỉ (Bắt buộc với TH nghỉ việc riêng Còn lại không bắt buộc) 1:Có hưởng lương, 2: Không hưởng lương</p>"
          }
        ]
      }
    },
    "examples": [
      {
        "title": "Example usage:",
        "content": "curl -i http://localhost:8080/smartoffice/api/v1/ttns/41387/compassionate-leave",
        "type": "curl"
      }
    ],
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":\"Thành công\",\"entityType\":\"java.lang.StringBuilder\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS_CompassionateLeave"
  },
  {
    "type": "post",
    "url": "/:id/remaining-annual",
    "title": "Lấy số ngày phép còn lại của nhân viên",
    "name": "remaining_annual",
    "group": "TTNS_CompassionateLeave",
    "description": "<p>APIs Lấy số ngày phép còn lại của nhân viên. <br> http://localhost:8080/smartoffice/api/v1/ttns/{id}/remaining-annual</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "examples": [
      {
        "title": "Example usage:",
        "content": "curl -i http://localhost:8080/smartoffice/api/v1/ttns/41387/remaining-annual",
        "type": "curl"
      }
    ],
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS_CompassionateLeave"
  },
  {
    "type": "post",
    "url": "/register/inout/approved/:id",
    "title": "approved",
    "name": "approved",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>1 = approved, 2 = deny, 3 = queue, 4 = all</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_time",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "end_time",
            "description": ""
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":[],\"entityType\":\"java.util.ArrayList\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/delete/:id",
    "title": "DELETE register in out by id",
    "name": "delete",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>The register in out-ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":\"OK\",\"entityType\":\"java.lang.String\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout",
    "title": "Get list register in out",
    "name": "getListInOut",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>[ALL, DELETE, UPDATE, INSERT] List type</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "sync_time",
            "description": ""
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/:id",
    "title": "Get register in out by id",
    "name": "inoutById",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>The register in out-ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"empOutRegId\":43690,\"workPlaceId\":4,\"reasonDetail\":\"H?p v? quy?t to�n c�c d? �n b?t d?ng s?n.\",\"createDate\":null,\"createUser\":null,\"modifyDate\":null,\"modifyUser\":null,\"processingDate\":null,\"empApproveId\":41387,\"approveDate\":1443067029000,\"status\":1,\"empId\":17281,\"timeOutReg\":1426006800000,\"reasonOutId\":2,\"timeStart\":1426035600000,\"timeEnd\":1426048200000,\"reasonOut\":null,\"workPlace\":null,\"comment\":null},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/reason",
    "title": "reason",
    "name": "reason",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>The register in out-ID.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>[ALL, DELETE, UPDATE, INSERT] List type</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":[{\"reasonOutId\":165,\"code\":\"NcO\",\"name\":\"Nghỉ con ốm\",\"workdayTypeId\":449,\"timeHoursStart\":8,\"timeMinuteStart\":0,\"timeHoursEnd\":12,\"timeMinuteEnd\":0,\"workHours\":8,\"createdTime\":null},{\"reasonOutId\":41,\"code\":\"Test\",\"name\":\"something\",\"workdayTypeId\":447,\"timeHoursStart\":null,\"timeMinuteStart\":null,\"timeHoursEnd\":null,\"timeMinuteEnd\":null,\"workHours\":5,\"createdTime\":null},{\"reasonOutId\":164,\"code\":\"CT\",\"name\":\"Công tác\",\"workdayTypeId\":461,\"timeHoursStart\":null,\"timeMinuteStart\":null,\"timeHoursEnd\":null,\"timeMinuteEnd\":null,\"workHours\":8,\"createdTime\":null},{\"reasonOutId\":166,\"code\":\"KT\",\"name\":\"Khám thai\",\"workdayTypeId\":451,\"timeHoursStart\":8,\"timeMinuteStart\":30,\"timeHoursEnd\":12,\"timeMinuteEnd\":0,\"workHours\":8,\"createdTime\":null},{\"reasonOutId\":241,\"code\":\"CTnuangay\",\"name\":\"Công tác nửa ngày\",\"workdayTypeId\":461,\"timeHoursStart\":8,\"timeMinuteStart\":0,\"timeHoursEnd\":12,\"timeMinuteEnd\":0,\"workHours\":4,\"createdTime\":null},{\"reasonOutId\":221,\"code\":\"nghi sang\",\"name\":\"Nghỉ phép buổi sáng\",\"workdayTypeId\":452,\"timeHoursStart\":8,\"timeMinuteStart\":0,\"timeHoursEnd\":12,\"timeMinuteEnd\":0,\"workHours\":4,\"createdTime\":null},{\"reasonOutId\":222,\"code\":\"nghichieu\",\"name\":\"Nghỉ phép buổi chiều\",\"workdayTypeId\":452,\"timeHoursStart\":13,\"timeMinuteStart\":30,\"timeHoursEnd\":17,\"timeMinuteEnd\":30,\"workHours\":4,\"createdTime\":null},{\"reasonOutId\":223,\"code\":\"ra ngoai\",\"name\":\"Ra ngoài việc riêng\",\"workdayTypeId\":null,\"timeHoursStart\":null,\"timeMinuteStart\":null,\"timeHoursEnd\":null,\"timeMinuteEnd\":null,\"workHours\":null,\"createdTime\":null},{\"reasonOutId\":200,\"code\":\"NP\",\"name\":\"Nghỉ phép\",\"workdayTypeId\":452,\"timeHoursStart\":null,\"timeMinuteStart\":null,\"timeHoursEnd\":null,\"timeMinuteEnd\":null,\"workHours\":8,\"createdTime\":null},{\"reasonOutId\":201,\"code\":\"ĐH\",\"name\":\"Đi họp\",\"workdayTypeId\":null,\"timeHoursStart\":null,\"timeMinuteStart\":null,\"timeHoursEnd\":null,\"timeMinuteEnd\":null,\"workHours\":null,\"createdTime\":null}],\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/reason/:id",
    "title": "Get reason out by id",
    "name": "reasonById",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>The reason out-ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"reasonOutId\":165,\"code\":\"NcO\",\"name\":\"Nghỉ con ốm\",\"workdayTypeId\":449,\"timeHoursStart\":8,\"timeMinuteStart\":0,\"timeHoursEnd\":12,\"timeMinuteEnd\":0,\"workHours\":8,\"createdTime\":null},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout",
    "title": "Register in out",
    "name": "register",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "employee_id",
            "description": "<p>ID of employee</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_time",
            "description": "<p>Time stamp of start time</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "end_time",
            "description": "<p>Time stamp of end time</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reason_out_id",
            "description": "<p>Reason ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "work_place_id",
            "description": "<p>Work Place ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "reason_detail",
            "description": "<p>Detail reason</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":{\"empOutRegId\":44484,\"workPlaceId\":4,\"reasonDetail\":\"Di há»p dá»± Ã¡n\",\"createDate\":1494318327271,\"createUser\":\"118957\",\"modifyDate\":1494318327271,\"modifyUser\":\"118957\",\"processingDate\":1494318327271,\"empApproveId\":null,\"approveDate\":null,\"status\":2,\"empId\":47604,\"timeOutReg\":1494318327271,\"reasonOutId\":164,\"timeStart\":1495731600000,\"timeEnd\":1495818000000,\"reasonOut\":\"Công tác\",\"workPlace\":\"CROWNE - TANG 2\",\"comment\":null},\"entityType\":\"com.viettel.timekeeping.model.EmpOutRegBO\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/employee/effective/:id",
    "title": "get List in out reg of employee id effective",
    "name": "registerGetList",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_time",
            "description": "<p>Time stamp of start time</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "end_time",
            "description": "<p>Time stamp of end time</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>1 = approved, 2 = queue, 3 = deny, 4 = all</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":[{\"empOutRegId\":44480,\"workPlaceId\":4,\"reasonDetail\":\"Di họp dự án\",\"createDate\":1494317223758,\"createUser\":\"118957\",\"modifyDate\":1494317223758,\"modifyUser\":\"118957\",\"processingDate\":1494317223758,\"empApproveId\":null,\"approveDate\":null,\"status\":2,\"empId\":47604,\"timeOutReg\":1494317223758,\"reasonOutId\":164,\"timeStart\":1495731600000,\"timeEnd\":1495818000000,\"reasonOut\":\"Công tác\",\"workPlace\":\"CROWNE - TANG 2\"},{\"empOutRegId\":44481,\"workPlaceId\":4,\"reasonDetail\":\"Di họp dự án\",\"createDate\":1494317661739,\"createUser\":\"118957\",\"modifyDate\":1494317661739,\"modifyUser\":\"118957\",\"processingDate\":1494317661739,\"empApproveId\":null,\"approveDate\":null,\"status\":2,\"empId\":47604,\"timeOutReg\":1494317661739,\"reasonOutId\":164,\"timeStart\":1495731600000,\"timeEnd\":1495818000000,\"reasonOut\":\"Công tác\",\"workPlace\":\"CROWNE - TANG 2\"},{\"empOutRegId\":44484,\"workPlaceId\":4,\"reasonDetail\":\"Di há»p dá»± Ã¡n\",\"createDate\":1494318327271,\"createUser\":\"118957\",\"modifyDate\":1494318327271,\"modifyUser\":\"118957\",\"processingDate\":1494318327271,\"empApproveId\":null,\"approveDate\":null,\"status\":2,\"empId\":47604,\"timeOutReg\":1494318327271,\"reasonOutId\":164,\"timeStart\":1495731600000,\"timeEnd\":1495818000000,\"reasonOut\":\"Công tác\",\"workPlace\":\"CROWNE - TANG 2\"},{\"empOutRegId\":44483,\"workPlaceId\":4,\"reasonDetail\":\"Di họp dự án\",\"createDate\":1494317669841,\"createUser\":\"118957\",\"modifyDate\":1494317669841,\"modifyUser\":\"118957\",\"processingDate\":1494317669841,\"empApproveId\":null,\"approveDate\":null,\"status\":2,\"empId\":47604,\"timeOutReg\":1494317669841,\"reasonOutId\":164,\"timeStart\":1495731600000,\"timeEnd\":1495818000000,\"reasonOut\":\"Công tác\",\"workPlace\":\"CROWNE - TANG 2\"},{\"empOutRegId\":44482,\"workPlaceId\":4,\"reasonDetail\":\"Di họp dự án\",\"createDate\":1494317665300,\"createUser\":\"118957\",\"modifyDate\":1494317665300,\"modifyUser\":\"118957\",\"processingDate\":1494317665300,\"empApproveId\":null,\"approveDate\":null,\"status\":2,\"empId\":47604,\"timeOutReg\":1494317665300,\"reasonOutId\":164,\"timeStart\":1495731600000,\"timeEnd\":1495818000000,\"reasonOut\":\"Công tác\",\"workPlace\":\"CROWNE - TANG 2\"}],\"entityType\":\"java.util.ArrayList\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/update",
    "title": "Approve Register in out",
    "name": "update",
    "group": "TTNS_RegisterInOut",
    "description": "<p>APIs Approve Register in out. <br> http://localhost:8080/smartoffice/api/v1/ttns-inout/register/inout/update</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "emp_out_reg_id",
            "description": "<p>ID of register in out</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>Approve status [1=accept, 3=deny]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "reason",
            "description": "<p>Reason approve (Require if status = 2)</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "emp_approve_id",
            "description": "<p>EmployeeId of manager</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"BAD_REQUEST\",\"entity\":\"Employee have not permisson approved\",\"entityType\":\"java.lang.String\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":400},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/workplace",
    "title": "Get list work place",
    "name": "workplace",
    "group": "TTNS_RegisterInOut",
    "description": "<p>APIs Get list work place. <br> http://localhost:8080/smartoffice/api/v1/ttns-inout/register/inout/workplace</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>[ALL, DELETE, UPDATE, INSERT] List type</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "syncTime",
            "description": "<p>Time stamp of sync time</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":[{\"stt\":-2,\"dataSource\":\"HOALAC\",\"originId\":6,\"workPlaceId\":21,\"code\":null,\"name\":\"TANG HAM B2\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":1,\"dataSource\":\"HOALAC\",\"originId\":7,\"workPlaceId\":22,\"code\":null,\"name\":\"TANG 1\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":-1,\"dataSource\":\"HOALAC\",\"originId\":8,\"workPlaceId\":23,\"code\":null,\"name\":\"TANG HAM B1\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":2,\"dataSource\":\"HOALAC\",\"originId\":9,\"workPlaceId\":24,\"code\":null,\"name\":\"TANG 2\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":7,\"dataSource\":\"HOALAC\",\"originId\":10,\"workPlaceId\":25,\"code\":null,\"name\":\"TANG 7\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":6,\"dataSource\":\"HOALAC\",\"originId\":11,\"workPlaceId\":26,\"code\":null,\"name\":\"TANG 6\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":8,\"dataSource\":\"HOALAC\",\"originId\":12,\"workPlaceId\":27,\"code\":null,\"name\":\"TANG 8\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":9,\"dataSource\":\"HOALAC\",\"originId\":13,\"workPlaceId\":28,\"code\":null,\"name\":\"TANG 9\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":10,\"dataSource\":\"HOALAC\",\"originId\":14,\"workPlaceId\":29,\"code\":null,\"name\":\"TANG 10\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":11,\"dataSource\":\"HOALAC\",\"originId\":15,\"workPlaceId\":30,\"code\":null,\"name\":\"TANG 11\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":12,\"dataSource\":\"HOALAC\",\"originId\":16,\"workPlaceId\":31,\"code\":null,\"name\":\"TANG 12\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":15,\"dataSource\":\"HOALAC\",\"originId\":17,\"workPlaceId\":32,\"code\":null,\"name\":\"TANG 15\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":16,\"dataSource\":\"HOALAC\",\"originId\":18,\"workPlaceId\":33,\"code\":null,\"name\":\"TANG 16\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":17,\"dataSource\":\"HOALAC\",\"originId\":19,\"workPlaceId\":34,\"code\":null,\"name\":\"TANG 17\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":18,\"dataSource\":\"HOALAC\",\"originId\":20,\"workPlaceId\":35,\"code\":null,\"name\":\"TANG 18\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":19,\"dataSource\":\"HOALAC\",\"originId\":21,\"workPlaceId\":36,\"code\":null,\"name\":\"TANG 19\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":20,\"dataSource\":\"HOALAC\",\"originId\":22,\"workPlaceId\":37,\"code\":null,\"name\":\"TANG 20\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":21,\"dataSource\":\"HOALAC\",\"originId\":23,\"workPlaceId\":38,\"code\":null,\"name\":\"TANG 21\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1426472046000,\"modifyUser\":null,\"modifyDate\":1427108021000},{\"stt\":-2,\"dataSource\":\"CROWNE\",\"originId\":6,\"workPlaceId\":1,\"code\":null,\"name\":\"TANG HAM B2\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":1,\"dataSource\":\"CROWNE\",\"originId\":7,\"workPlaceId\":2,\"code\":null,\"name\":\"TANG 1\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":-1,\"dataSource\":\"CROWNE\",\"originId\":8,\"workPlaceId\":3,\"code\":null,\"name\":\"TANG HAM B1\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":2,\"dataSource\":\"CROWNE\",\"originId\":9,\"workPlaceId\":4,\"code\":null,\"name\":\"TANG 2\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":7,\"dataSource\":\"CROWNE\",\"originId\":10,\"workPlaceId\":5,\"code\":null,\"name\":\"TANG 7\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":6,\"dataSource\":\"CROWNE\",\"originId\":11,\"workPlaceId\":6,\"code\":null,\"name\":\"TANG 6\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":8,\"dataSource\":\"CROWNE\",\"originId\":12,\"workPlaceId\":7,\"code\":null,\"name\":\"TANG 8\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":9,\"dataSource\":\"CROWNE\",\"originId\":13,\"workPlaceId\":8,\"code\":null,\"name\":\"TANG 9\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":10,\"dataSource\":\"CROWNE\",\"originId\":14,\"workPlaceId\":9,\"code\":null,\"name\":\"TANG 10\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":11,\"dataSource\":\"CROWNE\",\"originId\":15,\"workPlaceId\":10,\"code\":null,\"name\":\"TANG 11\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":12,\"dataSource\":\"CROWNE\",\"originId\":16,\"workPlaceId\":11,\"code\":null,\"name\":\"TANG 12\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":15,\"dataSource\":\"CROWNE\",\"originId\":17,\"workPlaceId\":12,\"code\":null,\"name\":\"TANG 15\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":16,\"dataSource\":\"CROWNE\",\"originId\":18,\"workPlaceId\":13,\"code\":null,\"name\":\"TANG 16\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":17,\"dataSource\":\"CROWNE\",\"originId\":19,\"workPlaceId\":14,\"code\":null,\"name\":\"TANG 17\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":18,\"dataSource\":\"CROWNE\",\"originId\":20,\"workPlaceId\":15,\"code\":null,\"name\":\"TANG 18\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":19,\"dataSource\":\"CROWNE\",\"originId\":21,\"workPlaceId\":16,\"code\":null,\"name\":\"TANG 19\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":20,\"dataSource\":\"CROWNE\",\"originId\":22,\"workPlaceId\":17,\"code\":null,\"name\":\"TANG 20\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},{\"stt\":21,\"dataSource\":\"CROWNE\",\"originId\":23,\"workPlaceId\":18,\"code\":null,\"name\":\"TANG 21\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000}],\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/register/inout/workplace/:id",
    "title": "Get work place by id",
    "name": "workplaceById",
    "group": "TTNS_RegisterInOut",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>The work place-ID..</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"stt\":2,\"dataSource\":\"CROWNE\",\"originId\":9,\"workPlaceId\":4,\"code\":null,\"name\":\"TANG 2\",\"parentId\":null,\"address\":null,\"createUser\":null,\"createDate\":1425357179000,\"modifyUser\":null,\"modifyDate\":1427168505000},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsRegisterInOutApi.java",
    "groupTitle": "TTNS_RegisterInOut"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/employee/approve/update",
    "title": "Approve timekeeping employee by time",
    "name": "approveTimekeeping",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "employee_id",
            "description": "<p>Id of employee for get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "approve_emp_id",
            "description": "<p>Id of employee approve</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_time",
            "description": "<p>Time stamp of date time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "end_time",
            "description": "<p>Time stamp of date time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "comment",
            "description": "<p>comment of manager</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>[1:approve, 2 deny]</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/calculate/sabatical/update",
    "title": "Calculate Sabatical of employee",
    "name": "calculate_sabatical_update",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "lstEmpIds",
            "description": "<p>Employees</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "year",
            "description": "<p>year calculate</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/employee/delete",
    "title": "Delete timekeeping",
    "name": "deleteTimekeeping",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "employee_id",
            "description": "<p>Id of employee for get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "Id",
            "description": "<p>ID of timeKeeping</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "Comment",
            "description": "<p>Reason deleted, Requried if date timkeeping after now date</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/history-in-out",
    "title": "Insert history in out",
    "name": "history_in_out",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "history",
            "description": "<p>List history in out</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/employee",
    "title": "List time keeping by employee",
    "name": "timeKeepingEmployee",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "employee_id",
            "description": "<p>Id of employee for get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "manager_id",
            "description": "<p>Id of manage employee for get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "from_time",
            "description": "<p>Time stamp of from date to get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "to_time",
            "description": "<p>Time stamp of to date to get time keeping</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/employee",
    "title": "Time keeping for employee",
    "name": "timeKeepingEmployeeGetList",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "employee_id",
            "description": "<p>Id of employee for get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "time_keeping",
            "description": "<p>Time stamp of date time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "work_place_type",
            "description": "<p>[ONSITE_IN: work on site in Viettel group,ONSITE_OUT: work on site out Viettel group,DEFAULT: work on office]: required if type IN [WORK, WORK_HALF_DAY]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>[WORK: Work all day, LEAVE: Leave all day, WORK_HALF_DAY: Work half day (4h)]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "source_data",
            "description": "<p>tye of [default is: 'API_TIMEKEEPING', if time keeping by device this is MAC_ADDRESS]</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "private_key",
            "description": "<p>private key of uuid</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"BAD_REQUEST\",\"entity\":\"Do not timekeping after now\",\"entityType\":\"java.lang.String\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":400},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/device",
    "title": "Get all timekeeping device",
    "name": "timeKeeping_device",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>[ALL, DELETE, UPDATE, INSERT] List type</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "syncTime",
            "description": "<p>Time stamp of sync time</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":[{\"timekeepingDeviceId\":1,\"name\":\"Wifi PH1 T41\",\"address\":\"T41 Keangnam Landmark\",\"macAddress\":\"1c:2d\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":2,\"name\":\"WIFI tang 41\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\" 30:B5:C2:8A:7A:73\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":4,\"name\":\"WIFI tang 41\",\"address\":\"D-Link International\",\"macAddress\":\"BC:F6:85:C2:0A:F9\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":5,\"name\":\"WIFI tang 41\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"E8:94:F6:A8:59:CF\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":6,\"name\":\"WIFI tang 41\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"E8:94:F6:98:5F:81\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":3,\"name\":\"WIFI tang 41\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"E8:94:F6:A8:61:2B\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":7,\"name\":\"TTPM1_1\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"F8:E9:03:B7:F8:2C\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":8,\"name\":\"TP_LINK_A8612A\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"E8:94:F6:A8:61:2A\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":9,\"name\":\"TP_PM1_4\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"E8:94:F6:A8:59:CE\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":10,\"name\":\"TP_PM1_2\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"34:64:A9:0D:E3:5D\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},{\"timekeepingDeviceId\":11,\"name\":\"wifi-gdviet\",\"address\":\"TP-LINK TECHNOLOGIES CO.,LTD.\",\"macAddress\":\"E8:94:F6:98:5F:81\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000}],\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/device/:id",
    "title": "Get timekeeping device",
    "name": "timeKeeping_device_id",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>The TimeKeeping Device.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"timekeepingDeviceId\":1,\"name\":\"Wifi PH1 T41\",\"address\":\"T41 Keangnam Landmark\",\"macAddress\":\"1c:2d\",\"serialNumber\":\"123456aw\",\"type\":1,\"createdTime\":1475600400000},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/mobile-integrated",
    "title": "get private key",
    "name": "timeKeeping_mobile_integrated",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "employee_id",
            "description": "<p>Id of employee for get time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "uuid",
            "description": "<p>id of project/device</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"statusType\":\"OK\",\"entity\":\"ffaa6d124a9ebe7a53e4f0cf6dbdac2ebbf784e4df159bc02151927c2ffa226d\",\"entityType\":\"java.lang.String\",\"metadata\":{\"Content-Type\":[{\"type\":\"application\",\"subtype\":\"json\",\"parameters\":{},\"wildcardType\":false,\"wildcardSubtype\":false}]},\"status\":200},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/workDayType",
    "title": "List all work day type",
    "name": "timeKeeping_workDayType",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "workdayTypeId",
            "description": "<p>ID WorkDayType.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>Code of WorkDayType.</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>Name of WorkDayType</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "affairMode",
            "description": "<p>Công chế độ</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "shiftMod",
            "description": "<p>Công làm ca</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "overtimeMode",
            "description": "<p>Công làm thêm.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":[{\"workdayTypeId\":441,\"code\":\"K\",\"name\":\"K- Lương sản phẩm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":442,\"code\":\"CH\",\"name\":\"CH- Trực chỉ huy T7, CN, ngày lễ, ngày nghỉ bù lễ\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":null,\"overtimeMode\":1,\"isReturn\":null},{\"workdayTypeId\":443,\"code\":\"TT\",\"name\":\"TT- Trực ban ngày thường\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":444,\"code\":\"TĐT\",\"name\":\"TĐT - Trực đêm ngày thường\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":445,\"code\":\"C3\",\"name\":\"C3- Làm ca đêm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":446,\"code\":\"TL\",\"name\":\"TL- Trực ban ngày nghỉ hàng tuần hoặc lễ, tết\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":447,\"code\":\"X\",\"name\":\"X- Công chế độ tính lương thời gian\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":448,\"code\":\"Ô\",\"name\":\"Nghỉ ốm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":3550.0,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":2},{\"workdayTypeId\":449,\"code\":\"Cô\",\"name\":\"Cô- Con ốm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":3550.0,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":2},{\"workdayTypeId\":450,\"code\":\"TS\",\"name\":\"TS- Thai sản\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":3551.0,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":2},{\"workdayTypeId\":451,\"code\":\"KT\",\"name\":\"KT- Nghỉ khám thai, sảy thai\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":3551.0,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":2},{\"workdayTypeId\":452,\"code\":\"P\",\"name\":\"P- Nghỉ phép\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":453,\"code\":\"L\",\"name\":\"L- Nghỉ lễ, tết\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":454,\"code\":\"H\",\"name\":\"H- Học tập hưởng lương BH\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":455,\"code\":\"NB\",\"name\":\"NB- Nghỉ bù\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":456,\"code\":\"Ro\",\"name\":\"Ro- Nghỉ không lương\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":2},{\"workdayTypeId\":457,\"code\":\"Rv\",\"name\":\"Rv- Nghỉ việc riêng có hưởng lương\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":458,\"code\":\"CV\",\"name\":\"CV- Chờ việc\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":459,\"code\":\"TN\",\"name\":\"TN- Tai nạn\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":460,\"code\":\"Đc\",\"name\":\"Đc- Nghỉ chờ hưu\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":461,\"code\":\"CT\",\"name\":\"CT- Công tác\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":462,\"code\":\"GT\",\"name\":\"GT- Làm thêm ngày thường\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":2},{\"workdayTypeId\":463,\"code\":\"GN\",\"name\":\"GN- Làm thêm ngày nghỉ hàng tuần\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":null,\"overtimeMode\":1,\"isReturn\":null},{\"workdayTypeId\":464,\"code\":\"GL\",\"name\":\"GL- Làm thêm ngày lễ, tết\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":null,\"overtimeMode\":1,\"isReturn\":null},{\"workdayTypeId\":465,\"code\":\"OT\",\"name\":\"OT- Hưởng 70%\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":3551.0,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":466,\"code\":\"Rb\",\"name\":\"Rb- Công nghỉ việc riêng hưởng lương Bảo hiểm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":467,\"code\":\"Pb\",\"name\":\"Pb- Công nghỉ phép lương Bảo hiểm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":541,\"code\":\"CN\",\"name\":\"Công tác nước ngoài\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":581,\"code\":\"DS\",\"name\":\"DS - Dưỡng sức sau sinh và sau ốm\",\"description\":\"Công dưỡng sức sau sinh và sau ốm. Chấm khi nghỉ sau sinh 4 tháng và hết ốm\",\"isActive\":1,\"insuranceTypeId\":3557.0,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":641,\"code\":\"CHT\",\"name\":\"CHT - Trực chỉ huy ngày thường\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":621,\"code\":\"TĐL\",\"name\":\"TĐL - Trực đêm ngày lễ\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":622,\"code\":\"C\",\"name\":\"C- Chờ giao việc\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":null},{\"workdayTypeId\":681,\"code\":\"DTC\",\"name\":\"Đình chỉ công tác\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":701,\"code\":\"ĐT\",\"name\":\"Công đào tạo\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":662,\"code\":\"DC\",\"name\":\"Công di chuyển\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":741,\"code\":\"K3\",\"name\":\"K3 - Làm kíp 3\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":721,\"code\":\"K1\",\"name\":\"K1 - Làm kíp 1\",\"description\":null,\"isActive\":null,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":722,\"code\":\"K2\",\"name\":\"K2 - Làm kíp 2\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":1},{\"workdayTypeId\":723,\"code\":\"K4\",\"name\":\"K4 - Làm kíp 4\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":null,\"shiftMode\":1,\"overtimeMode\":null,\"isReturn\":1}],\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/employee/update",
    "title": "Approve time keeping for employee by id",
    "name": "updateTimekeeping",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "approve_employee_id",
            "description": "<p>ID of register in out</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>Id of self time keeping</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>[1: approve, 2: reject]</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "reason",
            "description": "<p>Require if status = 2</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "post",
    "url": "/v1/ttns-timekeeping/timeKeeping/workDayType/:id",
    "title": "Get work day type by id",
    "name": "workDayType",
    "group": "TTNS_TimeKeeping",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "TTNS-TOKEN",
            "description": "<p>Access-key get from /token to access TTNS.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "Id",
            "description": "<p>The WordayType-ID.</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "OK",
            "description": "<p>Success</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"workdayTypeId\":441,\"code\":\"K\",\"name\":\"K- Lương sản phẩm\",\"description\":null,\"isActive\":1,\"insuranceTypeId\":null,\"affairMode\":1,\"shiftMode\":null,\"overtimeMode\":null,\"isReturn\":1},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsTimeKeepingApi.java",
    "groupTitle": "TTNS_TimeKeeping"
  },
  {
    "type": "get",
    "url": "/get-access-token",
    "title": "API lấy access token",
    "name": "get_access_token",
    "group": "TTNS",
    "description": "<p>API lấy access token. <br> http://localhost:8080/smartoffice/api/v1/ttns/get-access-token</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "examples": [
      {
        "title": "Example usage:",
        "content": "curl -i http://10.58.71.138:8765/APIs/oauth/token?grant_type=password&client_id=smartOffice2-client-id&client_secret=12345&username=smartOffice2&password=password",
        "type": "curl"
      }
    ],
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "APIResponse",
            "description": "<p>OK contains access-key of TTNS</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":\"7bf4b181-8143-42a5-a5c1-76b5185a2da4\",\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/TtnsApi.java",
    "groupTitle": "TTNS"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_access_token",
    "title": "Lấy token để đăng nhập Voffice",
    "name": "get_access_token",
    "group": "Voffice",
    "description": "<p>Hàm Lấy token để đăng nhập Voffice. API: Authenticate.login <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "username",
            "description": "<p>Username đăng nhập</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>Password đăng nhập</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\"username\":\"010993\",\"password\":\"222222a@\"}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "access_token",
            "description": "<p>Access token của Voffice</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"access_token\":\"3F71412BAFDAE695DAA03108A21AAE57\",\"aes_key\":\"5626e23598951e0d1379f97c1687bb73VIAESKEYSPACE4f05646eb5187f61\",\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100956D701A507EB4253D8E4891D271A66158B9BA48D6795AB8B6ABEAA57796A4D1DD369C7E69CE4BFE8C98E00EB40FA254C45E3207B7FA56A2C1B21DB6660422855E9CCCA7DBEC1CCCD82A65C5D5A86C5945CFB5C4C4771432BE42C9D08565808C4CE6DA508BFCECFF4D214DB4C348420217C09F717F7DFA06F185634A06DF454DFCC6BF218F4B94D6EA72C144A229699CD10C7EB0E45C0814AB4254A29B1D853F35DACFB07AE68C27DEC8290738E5308C9A0444C4136051EFE58965EB49DE1753774F357A7755887B6AF2C4AC0F8EC7D5D3D141208CC995D65B4ABC67D7E56C764D9FFE45ADF0B1BCD752014EC5E414D802B1275603FBF6EE37460569087FEC650203010001\"},\"resultCode\":0}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_list_doc",
    "title": "Lấy chi tiết văn bản",
    "name": "get_list_doc",
    "group": "Voffice",
    "description": "<p>Hàm Lấy chi tiết văn bản. API: DocumentAction.getDocumentDetail <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "documentId",
            "description": "<p>Id văn bản</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "\t\t\t\t{\"documentId\":\"382752\"}\n{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"documentId\":382752\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"documentId\":382752,\"registerNumber\":\"12\",\"officeSender\":\"dfa\",\"code\":\"12/CV-dfa\",\"title\":\"test gui van ban cho admin\",\"promulgateDate\":\"26/07/2012 00:00:00\",\"receiveDate\":\"26/07/2012 00:00:00\",\"deadlineDate\":\"29/07/2012 00:00:00\",\"isArrive\":1,\"priorityId\":1,\"priority\":\"Bình thường\",\"content\":\"test gui van ban cho admin\",\"stypeId\":1,\"stype\":\"Bình thường\",\"areaId\":1,\"area\":\"Hành Chính\",\"isLock\":1,\"creatorId\":74,\"numberOfCopy\":2,\"listAttachment\":[{\"documentId\":382752,\"attachment\":\"/Van_ban/2012/7/26/382752/SEFOLTgwMDI4NTIyOTAwMDAtMDlDTi1ZMjAxMS1MMDAgQkg=.pdf\",\"name\":\"HAN-8002852290000-09CN-Y2011-L00 BH.pdf\",\"fileAttachmentId\":373056}],\"attachFiles\":[{\"documentId\":382752,\"attachment\":\"/Van_ban/2012/7/26/382752/SEFOLTgwMDI4NTIyOTAwMDAtMDlDTi1ZMjAxMS1MMDAgQkg=.pdf\",\"name\":\"HAN-8002852290000-09CN-Y2011-L00 BH.pdf\",\"fileAttachmentId\":373056}],\"listComment\":[{\"staffId\":55433,\"receiverId\":26201,\"receiveDate\":\"31/05/2016 09:52:57\",\"commentContent\":\"New\",\"groupId\":6683,\"senderName\":\"Nguyen Thanh Nam\",\"fullName\":\"Nguyen Thanh Nam\",\"senderEmail\":\"abcd@viettel.com.vn\",\"senderMobile\":\"132435345\",\"senderGroupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"groupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"receiverName\":\"Nguyễn Phúc Đức\",\"receiverEmail\":\"email010993@viettel.com.vn\",\"isReceiveDirect\":true},{\"staffId\":55433,\"receiverId\":26201,\"receiveDate\":\"31/05/2016 09:52:57\",\"commentContent\":\"New\",\"groupId\":6683,\"senderName\":\"Nguyen Thanh Nam\",\"fullName\":\"Nguyen Thanh Nam\",\"senderEmail\":\"abcd@viettel.com.vn\",\"senderMobile\":\"132435345\",\"senderGroupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"groupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"receiverName\":\"Nguyễn Phúc Đức\",\"receiverEmail\":\"email010993@viettel.com.vn\",\"isReceiveDirect\":true},{\"staffId\":72,\"receiverId\":26201,\"receiveDate\":\"26/05/2016 18:20:40\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"isReceiveDirect\":true},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:29:08\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:29:08 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:29:08\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:29:08 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:48\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:48 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:48\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:48 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:03\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:03 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:03\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:03 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:17:41\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:17:41 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:17:41\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:17:41 PM\"}],\"listReceiverSameUser\":[],\"listReceiver\":[{\"staffId\":26201,\"receiverId\":42789,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":733,\"receiverGroupId2\":148845,\"fullName\":\"Hoàng Anh Xuân\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Hoàng Anh Xuân\",\"receiverEmail\":\"733\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"733\",\"mobile\":\"0000000000\",\"total\":27,\"status\":2,\"documentInStaffId\":28061911,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":55377,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":736,\"receiverGroupId2\":148845,\"fullName\":\"Lê Đăng Dũng\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Lê Đăng Dũng\",\"receiverEmail\":\"736\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"736\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061912,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":55378,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":2440,\"receiverGroupId2\":148845,\"fullName\":\"Hoàng Công Vĩnh\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Hoàng Công Vĩnh\",\"receiverEmail\":\"2440\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"2440\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061916,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":25,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":8840,\"receiverGroupId2\":148845,\"fullName\":\"Hoàng Sơn\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Hoàng Sơn\",\"receiverEmail\":\"8840\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"8840\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061904,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":52026,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":737,\"receiverGroupId2\":148845,\"fullName\":\"Nguyễn Mạnh Hùng\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Nguyễn Mạnh Hùng\",\"receiverEmail\":\"737\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"737\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061903,\"isProcessed\":0,\"isInDepartment\":0}],\"listGroup\":[{\"receiverGroupId\":78,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:17\",\"documentInGroupId\":5082,\"documentId\":382752,\"receiverGroupName\":\"Phòng Kỹ thuật\",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Kỹ thuật\",\"total\":5},{\"receiverGroupId\":6697,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:17\",\"documentInGroupId\":5081,\"documentId\":382752,\"receiverGroupName\":\"Phòng Kế hoạch \",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Kế hoạch \",\"total\":0},{\"receiverGroupId\":135154,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:17\",\"documentInGroupId\":5080,\"documentId\":382752,\"receiverGroupName\":\"Phòng Công nghệ Thông tin\",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Công nghệ Thông tin\",\"total\":0},{\"receiverGroupId\":6701,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:16\",\"documentInGroupId\":5079,\"documentId\":382752,\"receiverGroupName\":\"Phòng Chính trị\",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Chính trị\",\"total\":0},{\"receiverGroupId\":118007,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:16\",\"documentInGroupId\":5078,\"documentId\":382752,\"receiverGroupName\":\"Ban Truyền thông\",\"receiverParentGroupId\":6683,\"groupName\":\"Ban Truyền thông\",\"total\":0}],\"id\":382752,\"isConfidential\":1,\"toDate\":\"26/07/2012 00:00:00\",\"documentAdjacentTypeId\":1,\"commentFromDir\":[{\"staffId\":55433,\"receiverId\":26201,\"receiveDate\":\"31/05/2016 09:52:57\",\"commentContent\":\"New\",\"groupId\":6683,\"senderName\":\"Nguyen Thanh Nam\",\"fullName\":\"Nguyen Thanh Nam\",\"senderEmail\":\"abcd@viettel.com.vn\",\"senderMobile\":\"132435345\",\"senderGroupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"groupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"receiverName\":\"Nguyễn Phúc Đức\",\"receiverEmail\":\"email010993@viettel.com.vn\",\"isReceiveDirect\":true},{\"staffId\":55433,\"receiverId\":26201,\"receiveDate\":\"31/05/2016 09:52:57\",\"commentContent\":\"New\",\"groupId\":6683,\"senderName\":\"Nguyen Thanh Nam\",\"fullName\":\"Nguyen Thanh Nam\",\"senderEmail\":\"abcd@viettel.com.vn\",\"senderMobile\":\"132435345\",\"senderGroupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"groupName\":\"Tổng Công ty Mạng lưới Viettel fullnameVO1\",\"receiverName\":\"Nguyễn Phúc Đức\",\"receiverEmail\":\"email010993@viettel.com.vn\",\"isReceiveDirect\":true},{\"staffId\":72,\"receiverId\":26201,\"receiveDate\":\"26/05/2016 18:20:40\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"isReceiveDirect\":true},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:29:08\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:29:08 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:29:08\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:29:08 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:48\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:48 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:48\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:48 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:03\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:03 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:26:03\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:26:03 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:17:41\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:17:41 PM\"},{\"staffId\":72,\"receiverId\":55433,\"receiveDate\":\"26/05/2016 18:17:41\",\"commentContent\":\"test\",\"groupId\":38,\"staffId2\":495224,\"groupId2\":254951,\"receiverId2\":1054,\"senderName\":\"Phạm Thị Hạnh\",\"fullName\":\"Phạm Thị Hạnh\",\"senderEmail\":\"495224\",\"senderMobile\":\"0976636353\",\"senderGroupName\":\"Phòng Sản phẩm văn phòng điện tử\",\"groupName\":\"Phòng Sản phẩm văn phòng điện tử - Trung tâm Phần mềm Viettel 1\",\"receiverName\":\"Nguyễn Thanh Nam\",\"receiverEmail\":\"1054\",\"dReceiveDate\":\"May 26, 2016 6:17:41 PM\"}],\"empRecipientDoc\":[],\"empSendDoc\":[{\"staffId\":26201,\"receiverId\":42789,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":733,\"receiverGroupId2\":148845,\"fullName\":\"Hoàng Anh Xuân\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Hoàng Anh Xuân\",\"receiverEmail\":\"733\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"733\",\"mobile\":\"0000000000\",\"total\":27,\"status\":2,\"documentInStaffId\":28061911,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":55377,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":736,\"receiverGroupId2\":148845,\"fullName\":\"Lê Đăng Dũng\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Lê Đăng Dũng\",\"receiverEmail\":\"736\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"736\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061912,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":55378,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":2440,\"receiverGroupId2\":148845,\"fullName\":\"Hoàng Công Vĩnh\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Hoàng Công Vĩnh\",\"receiverEmail\":\"2440\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"2440\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061916,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":25,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":8840,\"receiverGroupId2\":148845,\"fullName\":\"Hoàng Sơn\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Hoàng Sơn\",\"receiverEmail\":\"8840\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"8840\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061904,\"isProcessed\":0,\"isInDepartment\":0},{\"staffId\":26201,\"receiverId\":52026,\"receiveDate\":\"30/05/2016 09:06:33\",\"commentContent\":\"test\",\"receiverGroupId\":0,\"staffId2\":6485,\"receiverId2\":737,\"receiverGroupId2\":148845,\"fullName\":\"Nguyễn Mạnh Hùng\",\"groupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"receiverName\":\"Nguyễn Mạnh Hùng\",\"receiverEmail\":\"737\",\"receiverMobile\":\"0000000000\",\"receiverGroupName\":\"Thủ trưởng đơn vị - Ban Giám đốc Tập đoàn - Khối cơ quan Tập đoàn\",\"email\":\"737\",\"mobile\":\"0000000000\",\"status\":2,\"documentInStaffId\":28061903,\"isProcessed\":0,\"isInDepartment\":0}],\"groupReceiverDoc\":[{\"receiverGroupId\":78,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:17\",\"documentInGroupId\":5082,\"documentId\":382752,\"receiverGroupName\":\"Phòng Kỹ thuật\",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Kỹ thuật\",\"total\":5},{\"receiverGroupId\":6697,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:17\",\"documentInGroupId\":5081,\"documentId\":382752,\"receiverGroupName\":\"Phòng Kế hoạch \",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Kế hoạch \",\"total\":0},{\"receiverGroupId\":135154,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:17\",\"documentInGroupId\":5080,\"documentId\":382752,\"receiverGroupName\":\"Phòng Công nghệ Thông tin\",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Công nghệ Thông tin\",\"total\":0},{\"receiverGroupId\":6701,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:16\",\"documentInGroupId\":5079,\"documentId\":382752,\"receiverGroupName\":\"Phòng Chính trị\",\"receiverParentGroupId\":6683,\"groupName\":\"Phòng Chính trị\",\"total\":0},{\"receiverGroupId\":118007,\"staffId\":26201,\"groupId\":6683,\"receiveDate\":\"24/05/2016 14:12:16\",\"documentInGroupId\":5078,\"documentId\":382752,\"receiverGroupName\":\"Ban Truyền thông\",\"receiverParentGroupId\":6683,\"groupName\":\"Ban Truyền thông\",\"total\":0}],\"lstCvGroup\":[{\"groupID\":2323,\"groupId\":2323,\"name\":\" Trưởng phó P/B thuộc TTKV3\",\"receiveDate\":\"28/05/2016 09:29:50\"},{\"groupID\":10375,\"groupId\":10375,\"name\":\"646464\",\"receiveDate\":\"28/05/2016 09:29:50\"}],\"sendDocType\":\"Gửi qua hệ thống Voffice\"},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_list_meeting",
    "title": "Lấy danh sách 3 lịch họp gần nhất của user",
    "name": "get_list_meeting",
    "group": "Voffice",
    "description": "<p>Hàm Lấy danh sách 3 lịch họp gần nhất của user. API: MettingWeek.get3MeetingNearestOnDashboard <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "fromDate",
            "description": "<p>ngày hiện tại sau khi convert sang múi giờ việt nam.(truyền null hệ thống tự động lấy theo giờ hiện tại của server để so sánh) định dạng: dd/MM/yyyy hh24:mm:ss</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "pageSize",
            "description": "<p>số lượng cuộc họp lấy ra (null để lấy tất cả)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "\t\t\t\t{\"fromDate\":\"16/02/2017 14:09:00\",\"pageSize\":5} \n\t{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"fromDate\":\"16/02/2017 14:09:00\"\n\t\t,\"pageSize\":5\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "[{\"duration\":\"14:19 - 16:19\",\"roomName\":\"PH TTPm1\",\"subject\":\"Cuộc họp test3\",\"startHour\":\"14\",\"endHour\":\"16\",\"startMinute\":\"19\",\"endMinute\":\"19\",\"meetingId\":224316,\"startTime\":\"16/02/2017 14:19:00\",\"endTime\":\"16/02/2017 16:19:00\",\"isPresident\":0,\"isParticipate\":1,\"isPrepare\":0,\"type\":0},{\"duration\":\"17:21 - 19:21\",\"roomName\":\"PH TTPm1\",\"subject\":\"Cuộc họp test5\",\"startHour\":\"17\",\"endHour\":\"19\",\"startMinute\":\"21\",\"endMinute\":\"21\",\"meetingId\":224317,\"startTime\":\"16/02/2017 17:21:00\",\"endTime\":\"16/02/2017 19:21:00\",\"isPresident\":0,\"isParticipate\":1,\"isPrepare\":0,\"type\":0},{\"duration\":\"19:22 - 22:22\",\"roomName\":\"PH TTPm1\",\"subject\":\"Cuộc họp test4\",\"startHour\":\"19\",\"endHour\":\"22\",\"startMinute\":\"22\",\"endMinute\":\"22\",\"meetingId\":224318,\"startTime\":\"16/02/2017 19:22:00\",\"endTime\":\"16/02/2017 22:22:00\",\"isPresident\":0,\"isParticipate\":1,\"isPrepare\":0,\"type\":0}]",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_list_user_sign_with_role",
    "title": "Lấy dánh sách đơn vị và role của user",
    "name": "get_list_user_sign_with_role",
    "group": "Voffice",
    "description": "<p>Hàm Lấy dánh sách đơn vị và role của user. API : DocumentService.getLitsUserSignWithRole. <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "username",
            "description": "<p>username đăng nhập</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "[{\"userRoleId\":861216,\"sysUserId\":6485,\"orgId\":259210,\"fullName\":\"Nguyễn Phúc Đức\",\"orgName\":\"Trung tâm Phần mềm nhân sự - TT PM 1 - Trung tâm Phần mềm Viettel 1\"},{\"userRoleId\":861215,\"sysUserId\":6485,\"orgId\":259217,\"position\":\"Trưởng Trung tâm\",\"fullName\":\"Nguyễn Phúc Đức\",\"orgName\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\"}]",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_mission_detail",
    "title": "Lấy chi tiết nhiệm vụ",
    "name": "get_mission_detail",
    "group": "Voffice",
    "description": "<p>Hàm Lấy chi tiết nhiệm vụ. Method: missionAction.getMissionDetail <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "missionId",
            "description": "<p>id nhiệm vụ</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"missionId\":28542\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"missionId\":28542,\"missionName\":\"giao cho hồng 2204\",\"missionPath\":\"/28542/\",\"content\":\"fdsfe\",\"target\":\"fefe\",\"dateStart\":\"22/04/2017\",\"dateComplete\":\"22/04/2017\",\"orgType\":1,\"orgAssignId\":259217,\"orgAssignName\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"assignId\":6485,\"assignName\":\"Nguyễn Phúc Đức\",\"assignEmail\":\"nguyenphucduc:\\\"+_)(*&^%$#@!@viettel.com.vn\",\"assignMobilePhone\":\"0983015813\",\"orgPerformId\":259222,\"orgPerformName\":\"Nhóm sản phẩm 2 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"frequenceUpdate\":2,\"frequenceUpdateName\":\"Cập nhật theo tuần\",\"fieldId\":597,\"status\":1,\"statusName\":\"Chưa thực hiện\",\"createdDate\":\"22/04/2017\",\"createdBy\":6485,\"createdByName\":\"Nguyễn Phúc Đức\",\"createdByEmail\":\"nguyenphucduc:\\\"+_)(*&^%$#@!@viettel.com.vn\",\"createdByMobilePhone\":\"0983015813\",\"delFlag\":0,\"isTransferOrgPerform\":0,\"listSource\":[{\"sourceMapId\":26765,\"sourceName\":\"ề\",\"sourceType\":1,\"sourceTypeName\":\"Theo nguồn gốc khác\",\"objectType\":2}],\"permissionOfAssignOrg\":{\"created\":true,\"deliver\":true,\"guide\":false,\"edit\":true,\"delete\":true,\"transfer\":true,\"checked\":false},\"permissionOfPerformOrg\":{\"create\":true,\"reject\":false,\"approve\":false,\"update\":false},\"permissionOfCombinationOrg\":{\"update\":false},\"levelImportance\":1,\"isDocReport\":1,\"listDocumentRef\":[],\"missionGroup\":1},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_task_text",
    "title": "Lấy chi tiết công việc",
    "name": "get_task_text",
    "group": "Voffice",
    "description": "<p>Hàm Lấy chi tiết công việc. Method: taskAction.getTaskDetail <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "taskId",
            "description": "<p>id công việc</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"textId\":90144\n\t\t,\"type\":0\n\t\t,\"isListFile\":0\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"taskId\":1022992,\"taskName\":\"Công việc 2 người\",\"content\":\"dfg\",\"startTime\":\"05/04/2017 08:00\",\"endTime\":\"05/04/2017 17:30\",\"taskType\":1,\"taskTypeName\":\"Công việc chức năng\",\"commanderId\":6485,\"commanderName\":\"Nguyễn Phúc Đức\",\"enforcementId\":375911,\"enforcementName\":\"Trần Văn Bằng\",\"enforcementEmail\":\"375911\",\"enforcementMobilePhone\":\"987806506\",\"updateFrequency\":1,\"updateFrequencyName\":\"Cập nhật theo ngày\",\"fieldId\":77,\"commandType\":1,\"orgId\":259225,\"orgName\":\"Trợ lý nghiệp vụ - Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"completedPercent\":\"0\",\"isCompleted\":0,\"status\":2,\"statusName\":\"Đang thực hiện\",\"createdDate\":\"05/04/2017 23:16:00\",\"createdBy\":6485,\"taskResult\":\"s\",\"partitionBy\":\"201704\",\"taskPath\":\"/1022992/\",\"ratingPoint\":3,\"taskType2\":2,\"taskTypeName2\":\"Công việc đột xuất\",\"isMajor\":1,\"permissionsForTask\":{\"delete\":1,\"edit\":1,\"receiveTask\":0,\"rejectReceive\":0,\"reAssign\":0,\"close\":0,\"update\":0,\"approve\":0,\"rejectApprove\":0,\"transferredTask\":1},\"commanderMobilePhone\":\"0983015813\",\"commanderEmail\":\"nguyenphucduc:\\\"+_)(*&^%$#@!@viettel.com.vn\"},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/get_text_detail",
    "title": "Lấy chi tiết văn bản ký điện tử",
    "name": "get_text_detail",
    "group": "Voffice",
    "description": "<p>Hàm Lấy chi tiết văn bản ký điện tử. API: textAction.getTextDetail <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "textId",
            "description": "<p>Id của văn bản ký</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"textId\":90144\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"result\":{\"mess\":{\"errorCode\":200,\"message\":\"ThĂ nh cĂ´ng\"},\"data\": {\"title\":\"Tao file ky\",\"content\":\"Tao file ky\",\"departSentSign\":\"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"departSentSignFullPathVof2\":\"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"departSentSignId\":\"7385\",\"creator\":\"Nguyá»…n PhĂºc Äá»©c\",\"createDate\":\"03/04/2017 15:22:59\",\"email\":\"6485\",\"phoneNumber\":\"0983015813\",\"state\":\"1\",\"urgencyCode\":\"1\",\"urgencyName\":\"BĂ¬nh thÆ°á»ng\",\"securityCode\":\"1\",\"securityName\":\"BĂ¬nh thÆ°á»ng\",\"typeId\":\"13\",\"typeName\":\"Káº¿t luáº¬n\",\"promulgatingDepart\":\"Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"areaId\":7,\"areaString\":\"Káº¿ hoáº¡ch\",\"signLevel\":\"0\",\"code\":\"KL-PM1TTVPDT\",\"fileMainSign\":[{\"fileAttachmentId\":120477,\"fileName\":\"To trinh dieu chinh ke hoach san xuat 06 clip viral 4G.pdf\",\"filePath\":\"/Text/2017/4/3/90144/0b234807-314f-4079-9d13-00324017acb8.pdf\",\"storage\":\"storage8591\",\"lFilePage\":5,\"lFileSize\":3571137}],\"fileAttachFromSign\":[],\"fileAttachFromDoc\":[],\"listSubmitter\":[{\"textProcessId\":\"411583\",\"departSentSignFullPathVof2\":\"TrÆ°á»Ÿng Trung tĂ¢m - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"email\":\"6485\",\"departmentName\":\"TrÆ°á»Ÿng Trung tĂ¢m - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"departmentSignId\":\"6683\",\"signer\":\"Nguyá»…n PhĂºc Äá»©c\",\"signerId\":\"6485\",\"signerIdVO1\":\"26201\",\"signerCode\":\"010993\",\"status\":0,\"senderId\":26201,\"senderName\":\"Nguyá»…n PhĂºc Äá»©c\",\"receivedId\":\"259217\",\"haveImageSign\":\"0\",\"signatureType\":\"3\",\"signLevel\":\"0\",\"aliasName\":\"Nguyá»…n PhĂºc Äá»©c\",\"strCardNumner\":\"010993\",\"isCreateSignWeb2\":1,\"orgVhrSignName\":\"Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"stateUserSign\":0,\"mobile\":\"0983015813\",\"empVhrId\":6485,\"empVhrName\":\"Nguyá»…n PhĂºc Äá»©c\",\"lstFilesCommentSign\":[],\"isReplaceSigner\":1}],\"listReviewer\":[],\"listInnitialSigner\":[],\"lstStaffSend\":[{\"isSecrectaryVo1\":false,\"receiverId\":\"6485\",\"receiverName\":\"Nguyá»…n PhĂºc Äá»©c\",\"orgName\":\"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"orgId\":\"259219\"},{\"isSecrectaryVo1\":false,\"receiverId\":\"18927\",\"receiverName\":\"Pháº¡m XuĂ¢n HoĂ ng\",\"orgName\":\"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m Sáº£n pháº©m má»›i - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"orgId\":\"259228\"},{\"isSecrectaryVo1\":false,\"receiverId\":\"422850\",\"receiverName\":\"LĂª Cao CÆ°á»ng\",\"orgName\":\"Trá»£ lĂ½ nghiá»‡p vá»¥ - NhĂ³m sáº£n pháº©m 2 - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"orgId\":\"259223\"},{\"isSecrectaryVo1\":false,\"receiverId\":\"449648\",\"receiverName\":\"BĂ¹i TrÆ°á»ng Vinh\",\"orgName\":\"Thá»§ trÆ°á»Ÿng Ä‘Æ¡n vá»‹ - Ban GiĂ¡m Ä‘á»‘c - Trung tĂ¢m Pháº§n má»m Khai thĂ¡c dá»¯ liá»‡u - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"orgId\":\"259251\"},{\"isSecrectaryVo1\":false,\"receiverId\":\"488816\",\"receiverName\":\"Nguyá»…n Thá»‹ Thu\",\"orgName\":\"Trá»£ lĂ½ nghiá»‡p vá»¥ - NhĂ³m Dá»± Ă¡n - Trung tĂ¢m Pháº§n má»m TĂ¬ch há»£p - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"orgId\":\"259248\"},{\"isSecrectaryVo1\":false,\"receiverId\":\"495224\",\"receiverName\":\"Pháº¡m Thá»‹ Háº¡nh\",\"orgName\":\"Trá»£ lĂ½ nghiá»‡p vá»¥ - NhĂ³m Dá»± Ă¡n - Trung tĂ¢m Pháº§n má»m VÄƒn phĂ²ng Ä‘iá»‡n tá»¬ - TT PM 1 - Trung tĂ¢m Pháº§n má»m Viettel 1\",\"orgId\":\"259225\"}],\"textId\":90144,\"isLienKe\":0,\"creatorId\":26201,\"officePublishedId\":259217,\"autoPublicText\":\"0\",\"autoPromulgateText\":\"1\",\"autoSendText\":\"1\",\"AUTO_PROMULGATE_TEXT\":1,\"AUTO_SEND_TEXT\":1,\"isCreateSignWeb2\":1,\"stateUserSign\":0,\"creatorIdVof2\":6485,\"sendDate\":\"03/04/2017 15:22:59\"}}}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/search_doc",
    "title": "Tìm kiếm danh sách văn bản + số lượng vb",
    "name": "search_doc",
    "group": "Voffice",
    "description": "<p>Hàm Tìm kiếm danh sách văn bản + số lượng vb. API: DocumentAction.search <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "isCount",
            "description": "<p>0 - lấy danh sách; 1 - lấy số lượng</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "startRecord",
            "description": "<p>bản ghi bắt đầu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "pageSize",
            "description": "<p>số bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "status",
            "description": "<p>Trạng thái xử lý (0 - tất cả; 1 - công văn chưa xử lý; 2 - Công văn chưa đọc; 3 - Công văn đã đọc; 4 - công văn đã xử lý )</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>1 - Công văn nhận được; 2 - công văn tôi tạo; 3 - công văn chuyển đi</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "documentId",
            "description": "<p>Id văn bản</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>Tiêu đề văn bản</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "\t{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"isCount\":\"0\"\n\t\t,\"title\":\"8:31 hongntl chuyển văn bản thường cho nhóm\"\n\t\t,\"status\":\"0\"\n\t\t,\"type\":\"3\"\n\t\t,\"documentId\":391177\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":[{\"documentId\":391177,\"code\":\"3131/CT\",\"title\":\"8:31 hongntl chuyển văn bản thường cho nhóm\",\"promulgateDate\":\"24/02/2017 00:00:00\",\"receiveDate\":\"24/02/2017 00:00:00\",\"isArrive\":1,\"priorityId\":1,\"priority\":\"Bình thường\",\"typeId\":2,\"type\":\"Chỉ thị\",\"stypeId\":1,\"stype\":\"Bình thường\",\"areaId\":2,\"area\":\"Công nghệ thông tin\",\"total\":1,\"listAttachment\":[{\"documentId\":391177,\"attachment\":\"/Van_ban/2017/2/24/391177/593f3c53-6012-492b-96d4-37dfb33ba5d1.pdf\",\"name\":\"Test chữ ký ngang_4ck.pdf\",\"fileAttachmentId\":382710,\"storage\":\"storage8591\",\"filePage\":1,\"fileSize\":103490}],\"sendDocType\":\"Gửi qua hệ thống Voffice\"}],\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/search_mission",
    "title": "Tìm kiếm danh sách nhiệm vụ",
    "name": "search_mission",
    "group": "Voffice",
    "description": "<p>Hàm Tìm kiếm danh sách nhiệm vụ. API: missionAction.findMissionByCondition Thuc hien: &quot;enforcementId&quot;:6485 <br> Giao di : &quot;commanderId&quot;:6485 <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "isCount",
            "description": "<p>0 - lấy danh sách; 1 - lấy số lượng</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "startRecord",
            "description": "<p>bản ghi bắt đầu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "pageSize",
            "description": "<p>số bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "typeMission",
            "description": "<p>tim kiếm theo loại nhiệm vụ(Nhiệm vụ thực hiện: 1, Nhiệm vụ giao đi: 2, Nhiệm vụ phối hợp: 3, Nhiệm vụ BGĐ giao: 4, Nhiệm vụ tôi giao: 5, Nhiệm vụ đơn vị đăng ky': 6, Nhiệm vụ sắp hết hạn: 7)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "missionName",
            "description": "<p>tên nhiệm vụ</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "missionId",
            "description": "<p>Id nhiệm vụ bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "content",
            "description": "<p>(Lựa chọn) nội dung NV</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "orgAssignId",
            "description": "<p>(Lựa chọn) id đơn vị giao NV</p>"
          },
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "orgPerformId",
            "description": "<p>(Lựa chọn) đơn vị thực hiện NV</p>"
          },
          {
            "group": "Parameter",
            "type": "Array",
            "optional": false,
            "field": "searchOrgIds",
            "description": "<p>(Lựa chọn) tim kiếm theo đơn vị</p>"
          },
          {
            "group": "Parameter",
            "type": "Array",
            "optional": false,
            "field": "listStatus",
            "description": "<p>(Lựa chọn) tim kiếm theo danh sach trạng thái của nhiệm vụ (Chậm tiến độ: 0, Chưa thực hiện: 1,\tĐang thực hiện: 2, Đa hoàn thành: 3, Đa kết thúc: 4, Yêu cầu đóng: 5, Đã đóng: 6, Yêu cầu gia hạn: 7, Chưa đóng: 8, Đã chuyển: 9)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"isCount\":\"0\"\n\t\t,\"missionName\":\"Tên nhiệm vụ_biên bản họp\"\n\t\t,\"typeMission\":\"2\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":[{\"missionId\":28479,\"missionName\":\"Tên nhiệm vụ_biên bản họp\",\"missionPath\":\"/28479/\",\"content\":\"Nội dung nhiệm vụ_biên bản họp\",\"target\":\"Mục tiêu nhiệm vụ\",\"dateStart\":\"08/04/2017 00:00:00\",\"dateComplete\":\"18/04/2017 00:00:00\",\"weight\":1,\"orgAssignId\":259217,\"assignId\":6485,\"assignEmail\":\"nguyenphucduc:\\\"+_)(*&^%$#@!@viettel.com.vn\",\"orgPerformId\":259220,\"frequenceUpdate\":2,\"fieldId\":7,\"status\":1,\"createdDate\":\"08/04/2017 17:21:01\",\"createdBy\":6485,\"updatedDate\":\"08/04/2017 17:26:28\",\"isCompleted\":0,\"isTransferOrgPerform\":0,\"ORG_PERFORM_NAME\":\"Nhóm sản phẩm 1 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"ORG_ASSIGN_NAME\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"USER_ASSIGN_NAME\":\"Nguyễn Phúc Đức\",\"EMP_LEVEL\":\"9223372036854775807\",\"POSITION_NAME\":\"Thủ trưởng\",\"lstMissionProcesses\":[],\"isDocReport\":1,\"orgPerform\":{\"sysOrganizationId\":259220,\"pathName\":\"Nhóm sản phẩm 1 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"isActive\":0},\"orgAssign\":{\"sysOrganizationId\":259217,\"pathName\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"isActive\":0},\"assign\":{\"fullName\":\"Nguyễn Phúc Đức\",\"empLevel\":9223372036854775807,\"sysUserId\":6485,\"positionName\":\"Thủ trưởng\"},\"documentReference\":[],\"missionGroup\":1},{\"missionId\":28481,\"missionName\":\"Tên nhiệm vụ_biên bản họp\",\"missionPath\":\"/28481/\",\"content\":\"Nội dung nhiệm vụ_biên bản họp\",\"target\":\"Mục tiêu nhiệm vụ\",\"dateStart\":\"08/04/2017 00:00:00\",\"dateComplete\":\"18/04/2017 00:00:00\",\"weight\":1,\"orgAssignId\":259217,\"assignId\":6485,\"assignEmail\":\"nguyenphucduc:\\\"+_)(*&^%$#@!@viettel.com.vn\",\"orgPerformId\":259224,\"frequenceUpdate\":2,\"fieldId\":7,\"status\":1,\"createdDate\":\"08/04/2017 17:21:01\",\"createdBy\":6485,\"updatedDate\":\"08/04/2017 17:26:28\",\"isCompleted\":0,\"isTransferOrgPerform\":0,\"ORG_PERFORM_NAME\":\"Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"ORG_ASSIGN_NAME\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"USER_ASSIGN_NAME\":\"Nguyễn Phúc Đức\",\"EMP_LEVEL\":\"9223372036854775807\",\"POSITION_NAME\":\"Thủ trưởng\",\"lstMissionProcesses\":[],\"isDocReport\":1,\"orgPerform\":{\"sysOrganizationId\":259224,\"pathName\":\"Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"isActive\":0},\"orgAssign\":{\"sysOrganizationId\":259217,\"pathName\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"isActive\":0},\"assign\":{\"fullName\":\"Nguyễn Phúc Đức\",\"empLevel\":9223372036854775807,\"sysUserId\":6485,\"positionName\":\"Thủ trưởng\"},\"documentReference\":[],\"missionGroup\":1},{\"missionId\":28480,\"missionName\":\"Tên nhiệm vụ_biên bản họp\",\"missionPath\":\"/28480/\",\"content\":\"Nội dung nhiệm vụ_biên bản họp\",\"target\":\"Mục tiêu nhiệm vụ\",\"dateStart\":\"08/04/2017 00:00:00\",\"dateComplete\":\"18/04/2017 00:00:00\",\"weight\":1,\"orgAssignId\":259217,\"assignId\":6485,\"assignEmail\":\"nguyenphucduc:\\\"+_)(*&^%$#@!@viettel.com.vn\",\"orgPerformId\":259222,\"frequenceUpdate\":2,\"fieldId\":7,\"status\":1,\"createdDate\":\"08/04/2017 17:21:01\",\"createdBy\":6485,\"updatedDate\":\"08/04/2017 17:26:28\",\"isCompleted\":0,\"isTransferOrgPerform\":0,\"ORG_PERFORM_NAME\":\"Nhóm sản phẩm 2 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"ORG_ASSIGN_NAME\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"USER_ASSIGN_NAME\":\"Nguyễn Phúc Đức\",\"EMP_LEVEL\":\"9223372036854775807\",\"POSITION_NAME\":\"Thủ trưởng\",\"lstMissionProcesses\":[],\"isDocReport\":1,\"orgPerform\":{\"sysOrganizationId\":259222,\"pathName\":\"Nhóm sản phẩm 2 - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"isActive\":0},\"orgAssign\":{\"sysOrganizationId\":259217,\"pathName\":\"Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"isActive\":0},\"assign\":{\"fullName\":\"Nguyễn Phúc Đức\",\"empLevel\":9223372036854775807,\"sysUserId\":6485,\"positionName\":\"Thủ trưởng\"},\"documentReference\":[],\"missionGroup\":1}],\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/search_task",
    "title": "Tìm kiếm danh sách công việc",
    "name": "search_task",
    "group": "Voffice",
    "description": "<p>Hàm Tìm kiếm danh sách công việc. API : taskAction.getListTask <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "isCount",
            "description": "<p>0 - lấy danh sách; 1 - lấy số lượng</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "startRecord",
            "description": "<p>bản ghi bắt đầu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "pageSize",
            "description": "<p>số bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "taskName",
            "description": "<p>tên công việc</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>nội dung công việc</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "commanderId",
            "description": "<p>id người giao việc</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "enforcementId",
            "description": "<p>id người thực hiện</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"isCount\":\"0\"\n\t\t,\"taskName\":\"taoj cong viec tren mobile\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "[{\"taskId\":1022995,\"taskName\":\"suar viecj taoj cong viec tren mobile\",\"content\":\"kfkf\",\"startTime\":\"05/04/2017 23:40\",\"endTime\":\"06/04/2017 17:30\",\"taskType\":1,\"commanderId\":6485,\"commanderName\":\"Nguyễn Phúc Đức\",\"enforcementId\":18927,\"enforcementName\":\"Phạm Xuân Hoàng\",\"enforcementEmail\":\"18927\",\"enforcementMobilePhone\":\"0000000000\",\"commandType\":1,\"orgName\":\"Trợ lý nghiệp vụ - Nhóm Dự án - Trung tâm Phần mềm Văn phòng điện tử - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"completedPercent\":\"0\",\"isCompleted\":0,\"status\":1,\"createdBy\":6485,\"ratingPoint\":3,\"taskType2\":2,\"isMajor\":1,\"taskApprovalId\":6485,\"approvalState\":1,\"delayTime\":\"4:17:35:33\",\"fileId\":\"219029\",\"fileName\":\"Bao_cao_giao_nhiem_vu.pdf\",\"filePath\":\"/task/201704/056000/9d33ea8b-b782-4b2d-a10f-b40885d5a29d.pdf\",\"commanderMobilePhone\":\"0983015813\",\"commanderEmail\":\"6485\",\"listFileApproval\":[{\"fileAttachmentId\":219029,\"fileName\":\"Bao_cao_giao_nhiem_vu.pdf\",\"filePath\":\"/task/201704/056000/9d33ea8b-b782-4b2d-a10f-b40885d5a29d.pdf\",\"fileType\":1}],\"fileType\":1,\"period\":\"201704\",\"createName\":\"Nguyễn Phúc Đức\"},{\"taskId\":1022994,\"taskName\":\"taoj cong viec tren mobile\",\"content\":\"kfkf\",\"startTime\":\"05/04/2017 23:40\",\"endTime\":\"06/04/2017 17:30\",\"taskType\":1,\"commanderId\":6485,\"commanderName\":\"Nguyễn Phúc Đức\",\"enforcementId\":449648,\"enforcementName\":\"Bùi Trường Vinh\",\"enforcementEmail\":\"449648\",\"enforcementMobilePhone\":\"0000000000\",\"commandType\":1,\"orgName\":\"Thủ trưởng đơn vị - Ban Giám đốc - Trung tâm Phần mềm Khai thác dữ liệu - TT PM 1 - Trung tâm Phần mềm Viettel 1\",\"completedPercent\":\"0\",\"isCompleted\":0,\"status\":1,\"createdBy\":6485,\"ratingPoint\":3,\"taskType2\":2,\"isMajor\":1,\"taskApprovalId\":6485,\"approvalState\":1,\"delayTime\":\"4:17:35:33\",\"fileId\":\"219028\",\"fileName\":\"Bao_cao_giao_nhiem_vu.pdf\",\"filePath\":\"/task/201704/168274/86b30daf-008d-4d0c-9747-bc814dc7a341.pdf\",\"commanderMobilePhone\":\"0983015813\",\"commanderEmail\":\"6485\",\"listFileApproval\":[{\"fileAttachmentId\":219028,\"fileName\":\"Bao_cao_giao_nhiem_vu.pdf\",\"filePath\":\"/task/201704/168274/86b30daf-008d-4d0c-9747-bc814dc7a341.pdf\",\"fileType\":1}],\"fileType\":1,\"period\":\"201704\",\"createName\":\"Nguyễn Phúc Đức\"}]",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/search_text",
    "title": "Tìm kiếm danh sách văn bản ký điện tử",
    "name": "search_text",
    "group": "Voffice",
    "description": "<p>Hàm Tìm kiếm danh sách văn bản ký điện tử. API: textAction.searchText <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "isCount",
            "description": "<p>0 - lấy danh sách; 1 - lấy số lượng</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "startRecord",
            "description": "<p>bản ghi bắt đầu</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "pageSize",
            "description": "<p>số bản ghi</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>loại văn bản tìm kiếm (2 - văn bản xét duyệt; 3 - văn bản ký duyệt; 4 - văn bản ban hành; 7 - văn bản trình ký )</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "state",
            "description": "<p>trạng thái văn bản (-3 - Tìm kiếm tất cả ký chính cho mobile; -2 - Tìm kiếm tất cả ký nháy; -1 - Tìm kiếm tất cả ký chính cho web;  0 - chờ ký duyệt/xét duyệt, Chưa trình ký(khi type = 7); 1 - đang xử lý (khi type = 7), văn thư đã từ chối (khi type = 2); 2 - đã từ chối ký duyệt, lãnh đạo đã từ chối (khi type = 2); 3 - người ký cuối đã ký duyệt(Chờ ban hành), văn thư đã xét duyệt (khi type = 2); 4 - đã ký duyệt(user login đã ký khi type = 3), lãnh đạo đã ký duyệt(khi type = 2), đã ban hành (khi type = 4,7); 5 - Chờ ký nháy; 6 - Luồng công văn bị hủy(khi type = 2); 7 - văn bản đã ký nhưng bị lãnh đạo cấp trên từ chối ký; 25 - đã từ chối ký nháy; 27 - Đã hủy ban hành; 45 - đã ký nháy;)\tSMO lấy chờ ký nháy truyền: type = 3; state = 5\tLấy chờ ký duyệt truyền:  type = 3; state = 0</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "keyword",
            "description": "<p>từ khóa tìm kiếm (tìm kiếm theo mã văn bản, tiêu đề, nội dung, id văn bản)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>tiêu đề</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "description",
            "description": "<p>nội dung</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "registerNumber",
            "description": "<p>số đăng ký</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>mã văn bản</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "areaId",
            "description": "<p>id ngành(lĩnh vực)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "typeId",
            "description": "<p>id hình thức văn bản</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "\t{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"isCount\":\"0\"\n\t\t,\"status\":\"0\"\n\t\t,\"type\":\"3\"\n\t\t,\"state\":0\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/sum_doc",
    "title": "Lấy số lượng văn bản ký điện tử theo trạng thái trên màn hình home",
    "name": "sum_doc",
    "group": "Voffice",
    "description": "<p>Hàm Lấy số lượng văn bản ký điện tử theo trạng thái trên màn hình home. API: textAction.getCountTextDashboard <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "fromDate",
            "description": "<p>ngày tìm kiếm từ (mặc định là ngày của 2 tuần trước)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "toDate",
            "description": "<p>ngày tìm kiếm đến (mặc định là ngày hiện tại)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"fromDate\":\"02/02/2017\"\n\t\t,\"toDate\":\"16/02/2017\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "countTextSigned",
            "description": "<p>số lượng văn bản đang chờ ban hành</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "countTextWaitSign",
            "description": "<p>Số lượng văn bản đang chờ ký duyệt</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "countTextWaitingInitial",
            "description": "<p>số lượng văn bản đang chờ nháy</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "countTextSecretaryWaitSign",
            "description": "<p>số lượng văn bản đang chờ xét duyệt (với user là văn thư)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":{\"countTextSigned\":626,\"countTextWaitSign\":6,\"countTextWaitingInitial\":1},\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/sum_mission",
    "title": "Lấy số lượng nhiệm vụ",
    "name": "sum_mission",
    "group": "Voffice",
    "description": "<p>Hàm Lấy số lượng nhiệm vụ. API: missionAction.findMissionByCondition <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "typeMission",
            "description": "<p>tim kiếm theo loại nhiệm vụ (Nhiệm vụ thực hiện: 1, Nhiệm vụ giao đi: 2, Nhiệm vụ phối hợp: 3, Nhiệm vụ BGĐ giao: 4, Nhiệm vụ tôi giao: 5, Nhiệm vụ đơn vị đăng ky': 6, Nhiệm vụ sắp hết hạn: 7)</p>"
          },
          {
            "group": "Parameter",
            "type": "Array",
            "optional": false,
            "field": "listStatus",
            "description": "<p>(Lựa chọn) tim kiếm theo danh sach trạng thái của nhiệm vụ (Chậm tiến độ: 0, Chưa thực hiện: 1,\tĐang thực hiện: 2, Đa hoàn thành: 3, Đa kết thúc: 4, Yêu cầu đóng: 5, Đã đóng: 6, Yêu cầu gia hạn: 7, Chưa đóng: 8, Đã chuyển: 9)</p>"
          },
          {
            "group": "Parameter",
            "type": "Array",
            "optional": false,
            "field": "searchOrgIds",
            "description": "<p>(Lựa chọn) tim kiếm theo đơn vị</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"typeMission\":\"1\"\n\t\t,\"listStatus\":[0]\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "missionId",
            "description": "<p>id nhiệm vụ</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "missionName",
            "description": "<p>tên nhiệm vụ</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "status",
            "description": "<p>trạng thái nhiệm vụ (0. Chưa giao đi (đang ở trạng thái lưu tạm), 1. Chua thuc hien, 2. Dang thuc hien, 3. Da hoan thanh, 4. Da phe duyet, 5. Yeu cau dong, 6. Da dong, 7. Yêu cầu gia hạn)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"data\":1325,\"resultCode\":200}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  },
  {
    "type": "post",
    "url": "/v1/voffice/sum_task",
    "title": "lấy số lượng công việc",
    "name": "sum_task",
    "group": "Voffice",
    "description": "<p>Hàm lấy số lượng công việc. API: taskAction.getCountHomeTask <br>Test data: username/password: 010993/222222a@, 195266/222222a@, 196232/222222a@</p>",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>Users unique token access-key.</p>"
          }
        ]
      }
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "access_token",
            "description": "<p>Token accesss vào Voffice</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "aes_key",
            "description": "<p>AES key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rsa_public_key",
            "description": "<p>RSA public key để encrypt data</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "type",
            "description": "<p>Loại (0- việc giao đi; 1 - việc thực hiện)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Request-Example:",
          "content": "{\n\t\t\"access_token\":\"EA55FD0EAE096A02A87CB827BC2F468B\"\n\t\t,\"aes_key\":\"8790ea77a45c2e936cc9c16f6e05c06aVIAESKEYSPACEe206828552b0b32e\"\n\t\t,\"rsa_public_key\":\"30820122300D06092A864886F70D01010105000382010F003082010A0282010100A54B212C966FA6EBD4B2307973D5D5EC6991C1B67A57047B15ABDB1EBB4417E1412F37E6DD4BEEA2178F90D27C4DD2126697B4B53FEB68262BB207EEA1A87A625BFD90525EDCD9B8C5497DE0408506F22A16B1E22AA2E5277EF7738FFA53B2FB8EF174D00680D91AE95B7FD525A9E5AC900A27BF33AFEEB2AA9A09757F0DD66ABE97B918BDEB12ABDAEA6AA934688038552DC9B233A375D0C0FC66E2106CE3D2C409671F54EDB28CB8BA0ED5C2AC561470240E2AE1F90EC9F6B219B2B1FB92A39DA4589C2C56DB3EBA41F0B9E8DEFBCE44CB6E2642957459F597A283FC1138750705CDD7D48CBF8308760ECB6B249539EBB26C4C3689DE4D34C193BFB2F3E8110203010001\"\n\t\t,\"type\":\"1\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "newTask",
            "description": "<p>số lượng việc chưa thực hiện</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "inProgress",
            "description": "<p>số lượng đang thực hiện</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "completed",
            "description": "<p>số lượng việc đã hoàn thành</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "overdue",
            "description": "<p>số lượng việc chậm tiến độ</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "urgenTask",
            "description": "<p>số lượng việc sắp đến hạn</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "typeTask",
            "description": "<p>loại việc 1  việc thực hiện; 0 - việc giao đi</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "isApprovalTask",
            "description": "<p>0 - ko có quyền ký PGV; 1 - có quyền ký phiếu giao việc</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "isApprovalEvalTask",
            "description": "<p>0 - ko có quyền ký đánh giá; 1 - có quyền đánh giá</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "approvalTask",
            "description": "<p>Số lượng phiếu giao việc</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "approvalEvaluation",
            "description": "<p>số lượng phiếu đánh giá</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "nDayUrgenTask",
            "description": "<p>số ngày cấu hình cảnh báo sắp đến hạn</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"newTask\":5,\"inProgress\":3,\"completed\":0,\"overdue\":448,\"approvalTask\":7,\"approvalEvaluation\":10,\"typeTask\":0,\"isApprovalTask\":1,\"isApprovalEvalTask\":1,\"nDayUrgenTask\":0}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "D:/programme/eclipse_workspace/smartoffice/src/com/viettel/smartoffice/api/VofficeApi.java",
    "groupTitle": "Voffice"
  }
] });
