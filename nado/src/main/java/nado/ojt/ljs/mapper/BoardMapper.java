package nado.ojt.ljs.mapper;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import nado.ojt.ljs.domain.BoardDefaultVO;
import nado.ojt.ljs.domain.BoardVO;

@Mapper("boardMapper")
public interface BoardMapper {

		/**
		 * 글을 등록한다.
		 * @param vo - 등록할 정보가 담긴 SampleVO
		 * @return 등록 결과
		 * @exception Exception
		 */
		void insertSample(BoardVO vo) throws Exception;

		/**
		 * 글을 수정한다.
		 * @param vo - 수정할 정보가 담긴 SampleVO
		 * @return void형
		 * @exception Exception
		 */
		void updateSample(BoardVO vo) throws Exception;

		/**
		 * 글을 삭제한다.
		 * @param vo - 삭제할 정보가 담긴 SampleVO
		 * @return void형
		 * @exception Exception
		 */
		void deleteSample(BoardVO vo) throws Exception;

		/**
		 * 글을 조회한다.
		 * @param vo - 조회할 정보가 담긴 SampleVO
		 * @return 조회한 글
		 * @exception Exception
		 */
		BoardVO selectSample(BoardVO vo) throws Exception;

		/**
		 * 글 목록을 조회한다.
		 * @param searchVO - 조회할 정보가 담긴 VO
		 * @return 글 목록
		 * @exception Exception
		 */
		List<?> selectSampleList(BoardDefaultVO searchVO) throws Exception;

		/**
		 * 글 총 갯수를 조회한다.
		 * @param searchVO - 조회할 정보가 담긴 VO
		 * @return 글 총 갯수
		 * @exception
		 */
		int selectSampleListTotCnt(BoardDefaultVO searchVO);

}
