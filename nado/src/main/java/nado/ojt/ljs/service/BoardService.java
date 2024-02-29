package nado.ojt.ljs.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import nado.ojt.ljs.domain.BoardDefaultVO;
import nado.ojt.ljs.domain.BoardVO;
import nado.ojt.ljs.mapper.BoardMapper;

@Service("boardService")
public class BoardService extends EgovAbstractServiceImpl{
	
		private static final Logger LOGGER = LoggerFactory.getLogger(BoardService.class);
	
		/** mybatis 사용 */ 
		 @Resource(name="boardMapper")
		 private BoardMapper mapper;

		/** ID Generation */
		@Resource(name = "egovIdGnrService")
		private EgovIdGnrService egovIdGnrService;

		/**
		 * 글을 등록한다.
		 * @param vo - 등록할 정보가 담긴 SampleVO
		 * @return 등록 결과
		 * @exception Exception
		 */
		public int insertSample(BoardVO vo) throws Exception {
			LOGGER.debug(vo.toString());

			/** ID Generation Service */
			int num = egovIdGnrService.getNextIntegerId();
			vo.setNum(num);
			LOGGER.debug(vo.toString());

			mapper.insertSample(vo);
			return num;
		}

		/**
		 * 글을 수정한다.
		 * @param vo - 수정할 정보가 담긴 SampleVO
		 * @return void형
		 * @exception Exception
		 */
		public void updateSample(BoardVO vo) throws Exception {
			mapper.updateSample(vo);
		}

		/**
		 * 글을 삭제한다.
		 * @param vo - 삭제할 정보가 담긴 SampleVO
		 * @return void형
		 * @exception Exception
		 */
		public void deleteSample(BoardVO vo) throws Exception {
			mapper.deleteSample(vo);
		}

		/**
		 * 글을 조회한다.
		 * @param vo - 조회할 정보가 담긴 SampleVO
		 * @return 조회한 글
		 * @exception Exception
		 */
		public BoardVO selectSample(BoardVO vo) throws Exception {
			BoardVO resultVO = mapper.selectSample(vo);
			if (resultVO == null)
				throw processException("info.nodata.msg");
			return resultVO;
		}

		/**
		 * 글 목록을 조회한다.
		 * @param searchVO - 조회할 정보가 담긴 VO
		 * @return 글 목록
		 * @exception Exception
		 */
		public List<?> selectSampleList(BoardDefaultVO searchVO) throws Exception {
			return mapper.selectSampleList(searchVO);
		}

		/**
		 * 글 총 갯수를 조회한다.
		 * @param searchVO - 조회할 정보가 담긴 VO
		 * @return 글 총 갯수
		 * @exception
		 */
		public int selectSampleListTotCnt(BoardDefaultVO searchVO) {
			return mapper.selectSampleListTotCnt(searchVO);
		}
}
