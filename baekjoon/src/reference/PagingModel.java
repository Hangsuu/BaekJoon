package reference;

//@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})})
//public class MybatisInterceptor implements Interceptor {
//
//	@Override
//	public Object intercept(Invocation invocation) throws Throwable {
//		Object[] args = invocation.getArgs();
//		MappedStatement mappedStatement = (MappedStatement) args[0];
//		BoundSql boundSql = mappedStatement.getBoundSql(args[1]);
//		String sql = boundSql.getSql().trim();
//
//		if(boundSql.getParameterObject() instanceof PagingModel) {	// 특정 class를 extends했을 경우
//			PagingModel parameterObject = (PagingModel) boundSql.getParameterObject();
//
//			if(parameterObject.getCurrentPage() > 0) { // currentPage가 정해진 페이지의 쿼리 조정
//				BoundSql newBoundSql = new BoundSql(mappedStatement.getConfiguration(), getPagingSQL(sql, (PaginModel) boundSql.getParameterObject()),
//						boundSql.getParameterMappings(), boundSql.getParameterObject());
//				MappedStatement newMappedStatement = new MappedStatement.Builder()
//			}
//		}
//	}
//}