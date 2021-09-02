package club.liujoker.myapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class dahuaApi_test {

     private static String data = "{\n" +
            "    \"body\": [\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-08\",\n" +
            "            \"name\": \"自营项目材料\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-08\",\n" +
            "            \"name\": \"自营项目材料\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-04\",\n" +
            "            \"name\": \"红酒\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-05\",\n" +
            "            \"name\": \"设计\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-06\",\n" +
            "            \"name\": \"绿化养护\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-07\",\n" +
            "            \"name\": \"维修\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06-05\",\n" +
            "            \"name\": \"契税\",\n" +
            "            \"parentcode\": \"TP-ZC-06\",\n" +
            "            \"parentname\": \"上交税金及附加（含契税）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02-01\",\n" +
            "            \"name\": \"10预收款\",\n" +
            "            \"parentcode\": \"TP-SR-02\",\n" +
            "            \"parentname\": \"建筑工程收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02-02\",\n" +
            "            \"name\": \"管理费\",\n" +
            "            \"parentcode\": \"TP-SR-02\",\n" +
            "            \"parentname\": \"建筑工程收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02-04\",\n" +
            "            \"name\": \"进度款-三材\",\n" +
            "            \"parentcode\": \"TP-SR-02\",\n" +
            "            \"parentname\": \"建筑工程收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02-05\",\n" +
            "            \"name\": \"分包工程\",\n" +
            "            \"parentcode\": \"TP-SR-02\",\n" +
            "            \"parentname\": \"建筑工程收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-07\",\n" +
            "            \"name\": \"其他收入\",\n" +
            "            \"parentcode\": \"TP-SR-05\",\n" +
            "            \"parentname\": \"其他收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-04\",\n" +
            "            \"name\": \"临时借款利息\",\n" +
            "            \"parentcode\": \"TP-SR-05\",\n" +
            "            \"parentname\": \"其他收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-02\",\n" +
            "            \"name\": \"备用金\",\n" +
            "            \"parentcode\": \"TP-SR-05\",\n" +
            "            \"parentname\": \"其他收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-05\",\n" +
            "            \"name\": \"意向金/认筹金\",\n" +
            "            \"parentcode\": \"TP-SR-05\",\n" +
            "            \"parentname\": \"其他收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-06\",\n" +
            "            \"name\": \"理财收支\",\n" +
            "            \"parentcode\": \"TP-SR-05\",\n" +
            "            \"parentname\": \"其他收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-08\",\n" +
            "            \"name\": \"其他\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06-06\",\n" +
            "            \"name\": \"其他税金\",\n" +
            "            \"parentcode\": \"TP-ZC-06\",\n" +
            "            \"parentname\": \"上交税金及附加（含契税）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-07-01\",\n" +
            "            \"name\": \"保证金支出\",\n" +
            "            \"parentcode\": \"TP-ZC-07\",\n" +
            "            \"parentname\": \"其他支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-07-02\",\n" +
            "            \"name\": \"备用金\",\n" +
            "            \"parentcode\": \"TP-ZC-07\",\n" +
            "            \"parentname\": \"其他支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-07-03\",\n" +
            "            \"name\": \"代垫款\",\n" +
            "            \"parentcode\": \"TP-ZC-07\",\n" +
            "            \"parentname\": \"其他支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-07-04\",\n" +
            "            \"name\": \"其他\",\n" +
            "            \"parentcode\": \"TP-ZC-07\",\n" +
            "            \"parentname\": \"其他支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-03\",\n" +
            "            \"name\": \"代垫款\",\n" +
            "            \"parentcode\": \"TP-SR-05\",\n" +
            "            \"parentname\": \"其他收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-02-03\",\n" +
            "            \"name\": \"临时借款\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-02\",\n" +
            "            \"parentname\": \"向集团外单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-02-04\",\n" +
            "            \"name\": \"统筹资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-02\",\n" +
            "            \"parentname\": \"向集团外单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-02-05\",\n" +
            "            \"name\": \"其他资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-02\",\n" +
            "            \"parentname\": \"向集团外单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-03\",\n" +
            "            \"name\": \"其他\",\n" +
            "            \"parentcode\": \"TP-CZ\",\n" +
            "            \"parentname\": \"筹资性现金净流量\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-JY\",\n" +
            "            \"name\": \"经营性现金净流量（负号表示净流出）\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-QC\",\n" +
            "            \"name\": \"期初货币资金\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-QC-01\",\n" +
            "            \"name\": \"可用资金\",\n" +
            "            \"parentcode\": \"TP-QC\",\n" +
            "            \"parentname\": \"期初货币资金\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-QC-02\",\n" +
            "            \"name\": \"受控资金\",\n" +
            "            \"parentcode\": \"TP-QC\",\n" +
            "            \"parentname\": \"期初货币资金\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-QM\",\n" +
            "            \"name\": \"期末货币资金\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR\",\n" +
            "            \"name\": \"经营性现金收入\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-01\",\n" +
            "            \"name\": \"房产销售收入\",\n" +
            "            \"parentcode\": \"TP-SR\",\n" +
            "            \"parentname\": \"经营性现金收入\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-01-01\",\n" +
            "            \"name\": \"其中：车位收入\",\n" +
            "            \"parentcode\": \"TP-SR-01\",\n" +
            "            \"parentname\": \"房产销售收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02\",\n" +
            "            \"name\": \"建筑工程收入\",\n" +
            "            \"parentcode\": \"TP-SR\",\n" +
            "            \"parentname\": \"经营性现金收入\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-03\",\n" +
            "            \"name\": \"商业运营收入\",\n" +
            "            \"parentcode\": \"TP-SR\",\n" +
            "            \"parentname\": \"经营性现金收入\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-04\",\n" +
            "            \"name\": \"物业管理收入\",\n" +
            "            \"parentcode\": \"TP-SR\",\n" +
            "            \"parentname\": \"经营性现金收入\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05\",\n" +
            "            \"name\": \"其他收入\",\n" +
            "            \"parentcode\": \"TP-SR\",\n" +
            "            \"parentname\": \"经营性现金收入\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-TZ\",\n" +
            "            \"name\": \"投资性现金净流量（负号表示净流出）\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-TZ-01\",\n" +
            "            \"name\": \"购置长期资产\",\n" +
            "            \"parentcode\": \"TP-TZ\",\n" +
            "            \"parentname\": \"投资性现金净流量（负号表示净流出）\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-TZ-02\",\n" +
            "            \"name\": \"其他\",\n" +
            "            \"parentcode\": \"TP-TZ\",\n" +
            "            \"parentname\": \"投资性现金净流量（负号表示净流出）\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01\",\n" +
            "            \"name\": \"成本支出\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01\",\n" +
            "            \"name\": \"房屋开发项目成本支出\",\n" +
            "            \"parentcode\": \"TP-ZC-01\",\n" +
            "            \"parentname\": \"成本支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-01\",\n" +
            "            \"name\": \"土地成本（不含契税）\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-02\",\n" +
            "            \"name\": \"前期工程费\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02-03\",\n" +
            "            \"name\": \"进度款-工程处\",\n" +
            "            \"parentcode\": \"TP-SR-02\",\n" +
            "            \"parentname\": \"建筑工程收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-02-06\",\n" +
            "            \"name\": \"甲指乙购\",\n" +
            "            \"parentcode\": \"TP-SR-02\",\n" +
            "            \"parentname\": \"建筑工程收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-03\",\n" +
            "            \"name\": \"建筑安装费\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-04\",\n" +
            "            \"name\": \"基础设施费\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-05\",\n" +
            "            \"name\": \"公建配套费\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-06\",\n" +
            "            \"name\": \"开发间接成本\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-01-07\",\n" +
            "            \"name\": \"资本化借款费用\",\n" +
            "            \"parentcode\": \"TP-ZC-01-01\",\n" +
            "            \"parentname\": \"房屋开发项目成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02\",\n" +
            "            \"name\": \"建筑工程成本支出\",\n" +
            "            \"parentcode\": \"TP-ZC-01\",\n" +
            "            \"parentname\": \"成本支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-03\",\n" +
            "            \"name\": \"商业经营成本支出\",\n" +
            "            \"parentcode\": \"TP-ZC-01\",\n" +
            "            \"parentname\": \"成本支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-04\",\n" +
            "            \"name\": \"物业管理成本支出\",\n" +
            "            \"parentcode\": \"TP-ZC-01\",\n" +
            "            \"parentname\": \"成本支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05\",\n" +
            "            \"name\": \"其他成本支出\",\n" +
            "            \"parentcode\": \"TP-ZC-01\",\n" +
            "            \"parentname\": \"成本支出\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-02\",\n" +
            "            \"name\": \"土地开发支出（一级土地整理和安置支出）\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-02-01\",\n" +
            "            \"name\": \"土地整理、安置费\",\n" +
            "            \"parentcode\": \"TP-ZC-02\",\n" +
            "            \"parentname\": \"土地开发支出（一级土地整理和安置支出）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-02-02\",\n" +
            "            \"name\": \"出让金返还\",\n" +
            "            \"parentcode\": \"TP-ZC-02\",\n" +
            "            \"parentname\": \"土地开发支出（一级土地整理和安置支出）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-03\",\n" +
            "            \"name\": \"管理费用\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-04\",\n" +
            "            \"name\": \"营业费用\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-05\",\n" +
            "            \"name\": \"财务费用\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06\",\n" +
            "            \"name\": \"上交税金及附加（含契税）\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06-01\",\n" +
            "            \"name\": \"其中：增值税\",\n" +
            "            \"parentcode\": \"TP-ZC-06\",\n" +
            "            \"parentname\": \"上交税金及附加（含契税）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06-02\",\n" +
            "            \"name\": \"增值税附加\",\n" +
            "            \"parentcode\": \"TP-ZC-06\",\n" +
            "            \"parentname\": \"上交税金及附加（含契税）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06-03\",\n" +
            "            \"name\": \"土地增值税\",\n" +
            "            \"parentcode\": \"TP-ZC-06\",\n" +
            "            \"parentname\": \"上交税金及附加（含契税）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-06-04\",\n" +
            "            \"name\": \"企业所得税\",\n" +
            "            \"parentcode\": \"TP-ZC-06\",\n" +
            "            \"parentname\": \"上交税金及附加（含契税）\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-07\",\n" +
            "            \"name\": \"其他支出\",\n" +
            "            \"parentcode\": \"TP-ZC\",\n" +
            "            \"parentname\": \"经营性现金支出\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-01-02\",\n" +
            "            \"name\": \"其中：房产收入\",\n" +
            "            \"parentcode\": \"TP-SR-01\",\n" +
            "            \"parentname\": \"房产销售收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-05-01\",\n" +
            "            \"name\": \"保证金收入\",\n" +
            "            \"parentcode\": \"TP-SR-01\",\n" +
            "            \"parentname\": \"房产销售收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-SR-06\",\n" +
            "            \"name\": \"其他产业收入\",\n" +
            "            \"parentcode\": \"TP-SR\",\n" +
            "            \"parentname\": \"经营性现金收入\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-01\",\n" +
            "            \"name\": \"劳务分包\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-03-01\",\n" +
            "            \"name\": \"融资贷入\",\n" +
            "            \"parentcode\": \"TP-CZ-01-03\",\n" +
            "            \"parentname\": \"自有资金融资净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-03-02\",\n" +
            "            \"name\": \"融资归还\",\n" +
            "            \"parentcode\": \"TP-CZ-01-03\",\n" +
            "            \"parentname\": \"自有资金融资净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02\",\n" +
            "            \"name\": \"资金调剂净额\",\n" +
            "            \"parentcode\": \"TP-CZ\",\n" +
            "            \"parentname\": \"筹资性现金净流量\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01\",\n" +
            "            \"name\": \"集团总部资金调剂净额\",\n" +
            "            \"parentcode\": \"TP-CZ-02\",\n" +
            "            \"parentname\": \"资金调剂净额\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-01\",\n" +
            "            \"name\": \"从集团总部调入\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01\",\n" +
            "            \"parentname\": \"集团总部资金调剂净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC\",\n" +
            "            \"name\": \"经营性现金支出\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-02\",\n" +
            "            \"name\": \"向集团总部调出\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01\",\n" +
            "            \"parentname\": \"集团总部资金调剂净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-02-01\",\n" +
            "            \"name\": \"其中：权益投资\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-02\",\n" +
            "            \"parentname\": \"向集团总部调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-02-02\",\n" +
            "            \"name\": \"调拨资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-02\",\n" +
            "            \"parentname\": \"向集团总部调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-02-03\",\n" +
            "            \"name\": \"临时借款\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-02\",\n" +
            "            \"parentname\": \"向集团总部调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ\",\n" +
            "            \"name\": \"筹资性现金净流量\",\n" +
            "            \"parentcode\": \"\",\n" +
            "            \"parentname\": \"\",\n" +
            "            \"intlevel\": 1,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01\",\n" +
            "            \"name\": \"外部融资净额\",\n" +
            "            \"parentcode\": \"TP-CZ\",\n" +
            "            \"parentname\": \"筹资性现金净流量\",\n" +
            "            \"intlevel\": 2,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-01\",\n" +
            "            \"name\": \"银行贷款净额\",\n" +
            "            \"parentcode\": \"TP-CZ-01\",\n" +
            "            \"parentname\": \"外部融资净额\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-01-01\",\n" +
            "            \"name\": \"银行贷入\",\n" +
            "            \"parentcode\": \"TP-CZ-01-01\",\n" +
            "            \"parentname\": \"银行贷款净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-01-02\",\n" +
            "            \"name\": \"归还贷款\",\n" +
            "            \"parentcode\": \"TP-CZ-01-01\",\n" +
            "            \"parentname\": \"银行贷款净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-02\",\n" +
            "            \"name\": \"债券融资净额\",\n" +
            "            \"parentcode\": \"TP-CZ-01\",\n" +
            "            \"parentname\": \"外部融资净额\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-02-01\",\n" +
            "            \"name\": \"债券发行\",\n" +
            "            \"parentcode\": \"TP-CZ-01-02\",\n" +
            "            \"parentname\": \"债券融资净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-02-02\",\n" +
            "            \"name\": \"债券偿还\",\n" +
            "            \"parentcode\": \"TP-CZ-01-02\",\n" +
            "            \"parentname\": \"债券融资净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-01-03\",\n" +
            "            \"name\": \"自有资金融资净额\",\n" +
            "            \"parentcode\": \"TP-CZ-01\",\n" +
            "            \"parentname\": \"外部融资净额\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-02-04\",\n" +
            "            \"name\": \"统筹资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-02\",\n" +
            "            \"parentname\": \"向集团总部调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-02-05\",\n" +
            "            \"name\": \"其他资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-02\",\n" +
            "            \"parentname\": \"向集团总部调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02\",\n" +
            "            \"name\": \"集团内单位资金调剂净额\",\n" +
            "            \"parentcode\": \"TP-CZ-02\",\n" +
            "            \"parentname\": \"资金调剂净额\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-01\",\n" +
            "            \"name\": \"从集团内单位调入\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02\",\n" +
            "            \"parentname\": \"集团内单位资金调剂净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-01-01\",\n" +
            "            \"name\": \"其中：权益投资\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-01\",\n" +
            "            \"parentname\": \"从集团内单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-01-02\",\n" +
            "            \"name\": \"调拨资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-01\",\n" +
            "            \"parentname\": \"从集团内单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-01-03\",\n" +
            "            \"name\": \"临时借款\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-01\",\n" +
            "            \"parentname\": \"从集团内单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-01-04\",\n" +
            "            \"name\": \"统筹资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-01\",\n" +
            "            \"parentname\": \"从集团内单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-01-05\",\n" +
            "            \"name\": \"其他资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-01\",\n" +
            "            \"parentname\": \"从集团内单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-02\",\n" +
            "            \"name\": \"向集团内单位调出\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02\",\n" +
            "            \"parentname\": \"集团内单位资金调剂净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-02-01\",\n" +
            "            \"name\": \"其中：权益投资\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-02\",\n" +
            "            \"parentname\": \"向集团内单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-02-02\",\n" +
            "            \"name\": \"调拨资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-02\",\n" +
            "            \"parentname\": \"向集团内单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-02-03\",\n" +
            "            \"name\": \"临时借款\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-02\",\n" +
            "            \"parentname\": \"向集团内单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-02-04\",\n" +
            "            \"name\": \"统筹资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-02\",\n" +
            "            \"parentname\": \"向集团内单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-02-02-05\",\n" +
            "            \"name\": \"其他资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-02-02\",\n" +
            "            \"parentname\": \"向集团内单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03\",\n" +
            "            \"name\": \"集团外单位资金调剂净额\",\n" +
            "            \"parentcode\": \"TP-CZ-02\",\n" +
            "            \"parentname\": \"资金调剂净额\",\n" +
            "            \"intlevel\": 3,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-01\",\n" +
            "            \"name\": \"从集团外单位调入\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03\",\n" +
            "            \"parentname\": \"集团外单位资金调剂净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-01-01\",\n" +
            "            \"name\": \"其中：权益投资\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-01\",\n" +
            "            \"parentname\": \"从集团外单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-01-01\",\n" +
            "            \"name\": \"其中：权益投资\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-01\",\n" +
            "            \"parentname\": \"从集团总部调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-01-02\",\n" +
            "            \"name\": \"调拨资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-01\",\n" +
            "            \"parentname\": \"从集团总部调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-01-03\",\n" +
            "            \"name\": \"临时借款\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-01\",\n" +
            "            \"parentname\": \"从集团总部调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-01-04\",\n" +
            "            \"name\": \"统筹资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-01\",\n" +
            "            \"parentname\": \"从集团总部调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-01-01-05\",\n" +
            "            \"name\": \"其他资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-01-01\",\n" +
            "            \"parentname\": \"从集团总部调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-01-02\",\n" +
            "            \"name\": \"调拨资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-01\",\n" +
            "            \"parentname\": \"从集团外单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-01-03\",\n" +
            "            \"name\": \"临时借款\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-01\",\n" +
            "            \"parentname\": \"从集团外单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-01-04\",\n" +
            "            \"name\": \"统筹资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-01\",\n" +
            "            \"parentname\": \"从集团外单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-01-05\",\n" +
            "            \"name\": \"其他资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-01\",\n" +
            "            \"parentname\": \"从集团外单位调入\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-02\",\n" +
            "            \"name\": \"向集团外单位调出\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03\",\n" +
            "            \"parentname\": \"集团外单位资金调剂净额\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 0,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-02-01\",\n" +
            "            \"name\": \"其中：权益投资\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-02\",\n" +
            "            \"parentname\": \"向集团外单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-CZ-02-03-02-02\",\n" +
            "            \"name\": \"调拨资金\",\n" +
            "            \"parentcode\": \"TP-CZ-02-03-02\",\n" +
            "            \"parentname\": \"向集团外单位调出\",\n" +
            "            \"intlevel\": 5,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-02\",\n" +
            "            \"name\": \"自购材料\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-03\",\n" +
            "            \"name\": \"统购材料\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-04\",\n" +
            "            \"name\": \"三材\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-05\",\n" +
            "            \"name\": \"甲指乙购\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-06\",\n" +
            "            \"name\": \"专业分包\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-02-07\",\n" +
            "            \"name\": \"其他（间接费用等）\",\n" +
            "            \"parentcode\": \"TP-ZC-01-02\",\n" +
            "            \"parentname\": \"建筑工程成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-01\",\n" +
            "            \"name\": \"苗木\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-02\",\n" +
            "            \"name\": \"甲供材料\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"TP-ZC-01-05-03\",\n" +
            "            \"name\": \"装潢材料\",\n" +
            "            \"parentcode\": \"TP-ZC-01-05\",\n" +
            "            \"parentname\": \"其他成本支出\",\n" +
            "            \"intlevel\": 4,\n" +
            "            \"isleaf\": 1,\n" +
            "            \"status\": 1,\n" +
            "            \"reference1\": \"\",\n" +
            "            \"reference2\": \"\",\n" +
            "            \"reference3\": \"\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"head\": {\n" +
            "        \"sucflag\": \"Y\",\n" +
            "        \"totalnum\": \"131\",\n" +
            "        \"errmsg\": \"\"\n" +
            "    }\n" +
            "}";

    @RequestMapping(value = "dahua",method = RequestMethod.POST)
    public String dahuaapi_zijin(HttpServletResponse response){
        return data;
    }

}
