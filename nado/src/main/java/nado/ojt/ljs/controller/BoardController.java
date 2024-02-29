package nado.ojt.ljs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmodules.validation.commons.DefaultBeanValidator;

import egovframework.rte.fdl.property.EgovPropertyService;
import nado.ojt.ljs.domain.BoardDefaultVO;
import nado.ojt.ljs.service.BoardService;

@Controller
public class BoardController {
	/** BoardService */
	@Resource(name = "boardService")
	private BoardService boardService;
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	/** Validator */
	@Resource(name = "beanValidator")
	protected DefaultBeanValidator beanValidator;
	
	@RequestMapping(value = "/index.do")
	public String index() {
		return "board/nado";
	}
	
	
	@RequestMapping(value = "/list.do")
	public String selectList(@ModelAttribute("boardVO") BoardDefaultVO searchVO, ModelMap model) {
		return "sample/list";
	}
}
	 